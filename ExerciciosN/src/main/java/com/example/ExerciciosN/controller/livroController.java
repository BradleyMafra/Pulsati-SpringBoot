package com.example.ExerciciosN.controller;

import com.example.ExerciciosN.model.aluguelModel;
import com.example.ExerciciosN.model.livroModel;
import com.example.ExerciciosN.repository.livroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class livroController {
    @Autowired
    private livroRepository repository;
    @GetMapping("/buscar")
    public List<livroModel> buscar(){return repository.findAll();}
    @GetMapping("/buscar/{id}")
    public livroModel buscar(@PathVariable int id){return repository.findById(id).get();}
    @PostMapping("/salvar")
    public livroModel salvar(@RequestBody livroModel livro){return repository.save(livro);}
    @PutMapping("/atualizar")
    public livroModel atualizar(@RequestBody livroModel livro){return repository.save(livro);}
    @DeleteMapping("/deletar")
    public void deletar(@PathVariable int id){repository.deleteById(id);}
}
