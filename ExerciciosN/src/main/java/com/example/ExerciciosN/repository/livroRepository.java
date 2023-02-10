package com.example.ExerciciosN.repository;

import com.example.ExerciciosN.model.livroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface livroRepository extends JpaRepository<livroModel, Integer> {
}
