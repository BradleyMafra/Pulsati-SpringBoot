package com.example.demo.controller;
import com.example.demo.model.usuariosModel;
import com.example.demo.repository.usuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class usuariosController {
    @Autowired
    private usuariosRepository repository;

    @GetMapping("/buscar")
    public List<usuariosModel> buscarTodos(){
        return repository.findAll();
    }
    @GetMapping("/buscar/{id}")
    public usuariosModel buscarPorId(@PathVariable int id){
        return repository.findById(id).get();
    }
    @PutMapping("/Atualizar")
    public usuariosModel atualizar(@RequestBody usuariosModel usuario){return repository.save(usuario);}
    @PostMapping("/Adicionar")
    public usuariosModel salvar(@RequestBody usuariosModel usuario){ return repository.save(usuario);}
    @DeleteMapping("/Deletar/{id}")
    public void  deletar(@PathVariable int id){ repository.deleteById(id);}
    @GetMapping("BuscarCPF/{CPF}")
    public usuariosModel buscarPorCPF(@PathVariable String CPF){return repository.findByCPF(CPF);}
    @GetMapping("/BuscarNOME/{NOME}")
    public List<usuariosModel> buscarPorNome(@PathVariable String NOME){return repository.findByNOME(NOME);}
    @GetMapping("/KEEPGOINGBROOH") // Encontra pessoa que tem JAVA no nome
    public List<usuariosModel> procuraNomeJava(){return repository.encontraPessoaJava();}
    @GetMapping("pesquisaPorCaracteristicas/{NOME}/{SEXO}/{TIPO_SANGUINEO}")
    public List<usuariosModel> pesquisaPorCaracteristicas(@PathVariable String NOME, @PathVariable String SEXO, @PathVariable String TIPO_SANGUINEO){
        return repository.pesquisaPorCaracteristicas(NOME,SEXO,TIPO_SANGUINEO);
    }
    @GetMapping("/MaiorPessoa")
    public List<usuariosModel> maiorDeIdade(){return  repository.maiorDeIdade();}
}