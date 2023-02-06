package com.example.demo.Repository;
import com.example.demo.Model.clienteModel;
import java.util.ArrayList;
import java.util.List;
public class clienteRepository {
    List<clienteModel> clientes = new ArrayList<>();
    public clienteRepository() {
        clientes.add(new clienteModel(1, "Joao", 20, 123));
        clientes.add(new clienteModel(2, "Maria", 30, 456));
        clientes.add(new clienteModel(3, "José", 40, 789));
        clientes.add(new clienteModel(4, "Pedro", 50, 101));
        clientes.add(new clienteModel(5, "Ana", 60, 112));
        clientes.add(new clienteModel(6, "Beatriz", 18, 456));
        clientes.add(new clienteModel(7, "Clara", 22, 654));
        clientes.add(new clienteModel(8, "Adalberto", 32, 789));
        clientes.add(new clienteModel(9, "Bento", 28, 987));
        clientes.add(new clienteModel(10, "Cintia", 29, 963));
    }

    public void addCliente(clienteModel cliente) {
        clientes.add(cliente);
    }

    public List<clienteModel> getClientes() {
        return clientes;
    }

    public void deleteCliente(clienteModel cliente) {
        clientes.remove(cliente);
    }

    public void updateCliente(clienteModel cliente) {
        for (clienteModel c : clientes) {
            if (c.getId() == cliente.getId()) {
                c.setNome(cliente.getNome());
                c.setIdade(cliente.getIdade());
                c.setCodigoCadastro(cliente.getCodigoCadastro());
            }
        }
    }

    public clienteModel getClienteById(int id) {
        for (clienteModel c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}