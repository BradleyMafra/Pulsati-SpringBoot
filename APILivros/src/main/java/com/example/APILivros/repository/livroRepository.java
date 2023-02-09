package com.example.APILivros.repository;

import com.example.APILivros.model.livroModel;
import com.sun.jdi.connect.Connector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface livroRepository extends JpaRepository<livroModel,Integer> {

}
