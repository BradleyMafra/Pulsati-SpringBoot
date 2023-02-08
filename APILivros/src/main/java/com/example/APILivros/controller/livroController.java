package com.example.APILivros.controller;
import java.util.List;
import com.example.APILivros.model.livroModel;
import com.example.APILivros.repository.livroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class livroController {
    @Autowired
    private livroRepository repository;
    @GetMapping("/buscar")
    public List<livroModel> buscarTodos(){return repository.findAll();}
    @GetMapping("/buscar/{autor}")
    public livroModel buscarLivroPorAutor(@PathVariable String autor){return repository.findByAutor(autor);}
}