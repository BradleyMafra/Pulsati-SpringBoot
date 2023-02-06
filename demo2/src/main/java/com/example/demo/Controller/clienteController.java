package com.example.demo.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Model.clienteModel;
import com.example.demo.Repository.clienteRepository;
import java.util.List;
@RestController
@RequestMapping("/cliente")
public class clienteController {
    private clienteRepository clienteRepository = new clienteRepository();
    @GetMapping("/Buscar")
    public ResponseEntity< List<clienteModel> > getClientes() {
        return ResponseEntity.ok( clienteRepository.getClientes() );
    }
    @PostMapping("/Adicionar")
    public void addCliente(@RequestBody clienteModel cliente) {
        clienteRepository.addCliente(cliente);
    }
    @DeleteMapping("/Deletar")
    public void deleteCliente(@RequestBody clienteModel cliente) {
        clienteRepository.deleteCliente(cliente);
    }
    @PutMapping("/Atualizar")
    public void updateCliente(@RequestBody clienteModel cliente) {
        clienteRepository.updateCliente(cliente);
    }
    @GetMapping("/Buscar/{id}")
    public ResponseEntity<clienteModel> getClienteById(@PathVariable int id) {
        return ResponseEntity.ok( clienteRepository.getClienteById(id) );
    }
}