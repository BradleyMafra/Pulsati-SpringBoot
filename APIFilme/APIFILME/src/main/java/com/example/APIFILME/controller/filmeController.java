package com.example.APIFILME.controller;
import java.util.List;
import com.example.APIFILME.model.filmeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.APIFILME.repository.filmeRepository;
@RestController
@RequestMapping("/Filme")
public class filmeController {
    @Autowired
    private filmeRepository repository;
    @GetMapping("/Buscar")
    public List<filmeModel> buscarTodos(){return repository.findAll();}
    @GetMapping("Buscar/{id}")
    public filmeModel buscarPorId(@PathVariable int id){return repository.findById(id).get();}
    @PutMapping("/Atualizar")
    public filmeModel atualizar(@RequestBody filmeModel filme){return repository.save(filme);}
    @PostMapping("/Adicionar")
    public filmeModel adicionar(@RequestBody filmeModel filme){return repository.save(filme);}
    @DeleteMapping("/Deletar/{id}")
    public void deletar(@PathVariable int id){repository.deleteById(id);}
}
