package com.example.APILivros.controller;
import java.util.List;
import com.example.APILivros.model.livroModel;
import com.example.APILivros.repository.livroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
public class livroController {
    @Autowired
    private livroRepository repository;
    @GetMapping("/buscar")
    public List<livroModel> buscarTodos(){return repository.findAll();}
    @GetMapping("/buscar/{id}")
    public livroModel buscarPorId(@PathVariable int id){return repository.findById(id).get();}

    @PostMapping("/adicionar")
    public livroModel adicionarLivro(@RequestBody livroModel livro){return repository.save(livro);}
    @PutMapping("/atualizar")
    public livroModel atualizarLivro(@RequestBody livroModel livro){return repository.save(livro);}
    @DeleteMapping("/deletar/{id}")
    public void deletarLivro(@PathVariable int id){repository.deleteById(id);}
}