package com.example.APITarefas.repository;
import com.example.APITarefas.model.tarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface tarefaRepository extends JpaRepository<tarefaModel, Integer> {

    @Query(value = "SELECT * FROM TAREFAS WHERE UPPER(TRIM(STATUS)) = UPPER(?1)", nativeQuery = true)
    public List<tarefaModel> encontrarStatus(String STATUS);
    //
    public List<tarefaModel> findByPRIORIDADE(int PRIORIDADE);
}
