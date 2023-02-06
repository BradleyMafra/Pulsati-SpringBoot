package com.example.demo.controller;
import com.example.demo.model.usuariosModel;
import com.example.demo.repository.usuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}