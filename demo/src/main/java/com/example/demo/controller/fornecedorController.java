package com.example.demo.controller;

import com.example.demo.model.fornecedorModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class fornecedorController {
    @GetMapping ("/fornecedor")

    public ResponseEntity<List<fornecedorModel>> fornecedor(){
        List<fornecedorModel> fornecedores = new ArrayList<>();

        fornecedores.add(new fornecedorModel(1,"Natan","123456789-78"));
        return ResponseEntity.ok(fornecedores);
    }
}
