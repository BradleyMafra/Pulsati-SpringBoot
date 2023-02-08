package com.example.Contatos.Controller;

import com.example.Contatos.Model.contatoModel;
import com.example.Contatos.Repository.contatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class contatoController {
    @Autowired
    private contatoRepository repository;
    @GetMapping("/buscar")
    public List<contatoModel> buscarTodosContatos(){return  repository.findAll();}
    @GetMapping("/buscar/{id_contato}")
    public contatoModel buscarPorContatoPorId(@PathVariable int id_contato){return repository.findById(id_contato).get();}
    @PutMapping("/atualizar")
    public contatoModel atualizarContato(@RequestBody contatoModel contato){return repository.save(contato);}
    @PostMapping("/adicionar")
    public contatoModel adicionarContato(@RequestBody contatoModel contato){return repository.save(contato);}
    @DeleteMapping("/deletar/{id_contato}")
    public void deletarContato(@PathVariable int id_contato){repository.deleteById(id_contato);}
    @GetMapping("/buscarPorNome/{nome}")
    public List<contatoModel> buscarPorNome(@PathVariable String nome){return repository.buscarPorNome(nome);}
}
