package com.example.APIFarmacia.controller;
import com.example.APIFarmacia.model.medicamentoModel;
import com.example.APIFarmacia.repository.medicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/medicamento")
public class medicamentoController {
    @Autowired
    private medicamentoRepository repository;
    @GetMapping("/buscar")
    public List<medicamentoModel> buscaToddos(){return repository.findAll();}
    @GetMapping("/buscar/{idMedicamento}")
    public medicamentoModel buscaPorID(@PathVariable int idMedicamento){return repository.findById(idMedicamento).get();}
    @PostMapping("/adicionar")
    public medicamentoModel adiconar(@RequestBody medicamentoModel medicamento){return repository.save(medicamento);}
    @PutMapping("/atualizar")
    public medicamentoModel atualizar(@RequestBody medicamentoModel medicamento){return repository.save(medicamento);}
    @DeleteMapping("/deletar")
    public void deletar(@PathVariable int idMedicamento){repository.deleteById(idMedicamento);}
}
