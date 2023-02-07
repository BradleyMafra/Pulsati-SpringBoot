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
}