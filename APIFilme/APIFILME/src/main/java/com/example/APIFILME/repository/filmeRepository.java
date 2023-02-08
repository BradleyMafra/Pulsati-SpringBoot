package com.example.APIFILME.repository;
import com.example.APIFILME.model.filmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;
public interface filmeRepository  extends JpaRepository<filmeModel, Integer> {
    @Query(value = "SELECT * FROM EXERCICIO_FILME WHERE DATA_LANCAMENTO LIKE '%2023%'", nativeQuery = true)
    public List<filmeModel> encontrarPelaData();
    @Query(value = "SELECT * FROM EXERCICIO_FILME WHERE PAIS_ORIGEM = ?1", nativeQuery = true)
    public List<filmeModel> encontrarPais(String PAIS_ORIGEM);
    @Query(value = "SELECT * FROM ANA_FILMES WHERE DATA_LANCAMENTO = ?1", nativeQuery = true)
    public List<filmeModel> encontrarData(Date DATA_LANCAMENTO);
    @Query(value = "SELECT * FROM EXERCICIO_FILME ORDER BY quantidade_vendas DESC", nativeQuery = true)
    public List<filmeModel> ordenarMaiorVenda();
}
