package com.example.APITarefas.controller;
import com.example.APITarefas.model.tarefaModel;
import com.example.APITarefas.repository.tarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class tarefaController {
    @Autowired
    private tarefaRepository repository;
    @GetMapping("/buscar")
    public List<tarefaModel> buscarTodasTarefa(){return repository.findAll();}
    @GetMapping("/buscar/{id_tarefa}")
    public tarefaModel buscarTodasTarefasPorId(@PathVariable int id_tarefa){return repository.findById(id_tarefa).get();}
    @PutMapping("/atualizar")
    public tarefaModel atualizarTarefa(@RequestBody tarefaModel tarefa){return repository.save(tarefa);}
    @PostMapping("/adicionar")
    public tarefaModel adicionarTarefa(@RequestBody tarefaModel tarefa){return repository.save(tarefa);}
    @DeleteMapping("/deletar")
    public void deletarTarefa(@PathVariable int id_tarefa){repository.deleteById(id_tarefa);}
    @GetMapping("/filtraStatus/{STATUS}")
    public List<tarefaModel> filtrarPorStatus(@PathVariable String STATUS){return repository.encontrarStatus(STATUS);}
    @GetMapping("/filtarPrioridade/{prioridade}")
    public List<tarefaModel> filtrarPorPrioridade(@PathVariable int PRIORIDADE){return repository.findByPRIORIDADE(PRIORIDADE);}

}
