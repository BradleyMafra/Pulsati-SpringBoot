package com.example.ExerciciosN.controller;

import com.example.ExerciciosN.model.aluguelModel;
import com.example.ExerciciosN.repository.aluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluguel")
public class aluguelController {
    @Autowired
    private aluguelRepository repository;
    @GetMapping("/buscar")
    public List<aluguelModel> buscar(){return repository.findAll();}
    @GetMapping("/buscar/{id}")
    public aluguelModel buscar(@PathVariable int id){return repository.findById(id).get();}
    @PostMapping("/salvar")
    public aluguelModel salvar(@RequestBody aluguelModel aluguel){return repository.save(aluguel);}
    @PutMapping("/atualizar")
    public aluguelModel atualizar(@RequestBody aluguelModel aluguel){return repository.save(aluguel);}
    @DeleteMapping("/deletar")
    public void deletar(@PathVariable int id){repository.deleteById(id);}
}
