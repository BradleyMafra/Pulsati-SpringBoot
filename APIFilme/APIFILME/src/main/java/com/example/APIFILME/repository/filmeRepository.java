package com.example.APIFILME.repository;

import com.example.APIFILME.model.filmeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface filmeRepository  extends JpaRepository<filmeModel, Integer> {

}
