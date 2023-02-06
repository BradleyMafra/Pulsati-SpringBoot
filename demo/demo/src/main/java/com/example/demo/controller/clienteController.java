package com.example.demo.controller;
import com.example.demo.model.clienteModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


    @RestController

    public class clienteController {
        @GetMapping("/cliente")

        public ResponseEntity<List<clienteModel>> cliente() {

            List<clienteModel> clientes = new ArrayList<>();
            clientes.add(new clienteModel(1, "Bradley", "123.871.549-40"));
            return  ResponseEntity.ok(clientes);
        }
    }