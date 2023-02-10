package com.example.APIFarmacia.repository;

import com.example.APIFarmacia.model.vendasModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vendaRepository extends JpaRepository<vendasModel, Integer> {

}
