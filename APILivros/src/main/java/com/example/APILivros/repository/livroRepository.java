package com.example.APILivros.repository;

import com.example.APILivros.model.livroModel;
import com.sun.jdi.connect.Connector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface livroRepository extends JpaRepository<livroModel,Integer> {
    @Query(value="SELECT * FROM LIVRO WHERE AUTOR = ?1")
    public livroModel findByAutor(String autor);
}
