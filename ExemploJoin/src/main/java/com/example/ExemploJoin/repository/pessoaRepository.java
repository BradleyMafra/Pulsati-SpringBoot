package com.example.ExemploJoin.repository;

import com.example.ExemploJoin.model.pessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pessoaRepository extends JpaRepository<pessoaModel, Long> {

}
