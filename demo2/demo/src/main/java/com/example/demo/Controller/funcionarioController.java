package com.example.demo.Controller;
import com.example.demo.Model.clienteModel;
import com.example.demo.Model.funcionarioModel;
import com.example.demo.Repository.funcionarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/funcionario")
@RestController
public class funcionarioController {
    private funcionarioRepository funcionarioRepository = new funcionarioRepository();

    @GetMapping("/Buscar")
    public ResponseEntity< List<funcionarioModel> > getFuncionarios() {
        return ResponseEntity.ok( funcionarioRepository.getFuncionarios() );
    }
    @PostMapping("/Adicionar")
    public void addFuncionarios(@RequestBody funcionarioModel funcionario) {
        funcionarioRepository.addFuncionario(funcionario);
    }
    @DeleteMapping("/Deletar")
    public void deleteFuncionario(@RequestBody funcionarioModel funcionario) {
        funcionarioRepository.deleteFuncionario(funcionario);
    }
    @PutMapping("/Atualizar")
    public void updateCliente(@RequestBody funcionarioModel funcionario) {
        funcionarioRepository.updateFuncionario(funcionario);
    }
    @GetMapping("/Buscar/{id}")
    public ResponseEntity<funcionarioModel> getFuncionarioById(@PathVariable int id) {
        return ResponseEntity.ok( funcionarioRepository.getFuncionarioById(id) );
    }
}