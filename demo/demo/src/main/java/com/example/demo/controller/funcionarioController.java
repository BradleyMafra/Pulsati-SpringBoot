package com.example.demo.controller;
import com.example.demo.model.funcionarioModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class funcionarioController {
    @GetMapping("/funcionario")

    public ResponseEntity<List<funcionarioModel>> funcionario(){
        List<funcionarioModel> funcionarios = new ArrayList<>();

        funcionarios.add(new funcionarioModel(1,"João","321.654.987-80"));
        return ResponseEntity.ok(funcionarios);
    };
}
