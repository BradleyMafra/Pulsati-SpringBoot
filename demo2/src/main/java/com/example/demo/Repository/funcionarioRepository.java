package com.example.demo.Repository;
import com.example.demo.Model.clienteModel;
import com.example.demo.Model.funcionarioModel;
import java.util.ArrayList;
import java.util.List;

public class funcionarioRepository {
    List<funcionarioModel> funcionarios = new ArrayList<>();

    public funcionarioRepository() {
        funcionarios.add(new funcionarioModel(1, "Bradley", "Mafra", 20, 1));
        funcionarios.add(new funcionarioModel(2, "Xaiane", "Cristóvão", 20, 2));
        funcionarios.add(new funcionarioModel(3, "Lexíe", "Magnum", 23, 3));
        funcionarios.add(new funcionarioModel(4, "Lórien", "Justo", 24, 4));
    }

    public void addFuncionario(funcionarioModel funcionario) {
        funcionarios.add(funcionario);
    }
    public List<funcionarioModel> getFuncionarios() { return funcionarios; }
    public void deleteFuncionario(funcionarioModel funcionario) { funcionarios.remove(funcionario); }
    public void updateFuncionario(funcionarioModel funcionario) {
        for (funcionarioModel f : funcionarios) {
            if (f.getId() == funcionario.getId()) {
                f.setNome(funcionario.getNome());
                f.setSobrenome(funcionario.getSobrenome());
                f.setIdade(funcionario.getIdade());
                f.setCodigoCadastro(funcionario.getCodigoCadastro());
            }
        }
    }

    public funcionarioModel getFuncionarioById(int id) {
        for (funcionarioModel f : funcionarios) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }
}
