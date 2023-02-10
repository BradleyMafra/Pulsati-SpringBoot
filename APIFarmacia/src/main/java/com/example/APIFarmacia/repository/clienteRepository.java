package com.example.APIFarmacia.repository;
import com.example.APIFarmacia.model.clienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clienteRepository extends JpaRepository<clienteModel, Integer> {
}