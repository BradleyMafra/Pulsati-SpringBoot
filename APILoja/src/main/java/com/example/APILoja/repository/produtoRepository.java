package com.example.APILoja.repository;
import com.example.APILoja.model.produtoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtoRepository extends JpaRepository<produtoModel, Integer> {

}
