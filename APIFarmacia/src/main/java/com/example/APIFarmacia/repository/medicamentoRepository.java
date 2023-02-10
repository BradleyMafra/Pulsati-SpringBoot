package com.example.APIFarmacia.repository;

import com.example.APIFarmacia.model.medicamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface medicamentoRepository extends JpaRepository<medicamentoModel, Integer> {

}
