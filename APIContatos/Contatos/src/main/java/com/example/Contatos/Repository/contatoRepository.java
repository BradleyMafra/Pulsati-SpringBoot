package com.example.Contatos.Repository;
import com.example.Contatos.Model.contatoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface contatoRepository extends JpaRepository<contatoModel,Integer> {
    @Query(value = "SELECT * FROM CONTATOS WHERE NOME = ?1", nativeQuery = true)
    public List<contatoModel> buscarPorNome(String nome);
}
