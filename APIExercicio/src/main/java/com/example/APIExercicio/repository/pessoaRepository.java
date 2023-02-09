package com.example.APIExercicio.repository;

import com.example.APIExercicio.Model.pessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pessoaRepository extends JpaRepository<pessoaModel, Integer> {

}
