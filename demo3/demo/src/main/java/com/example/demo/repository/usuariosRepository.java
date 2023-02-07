package com.example.demo.repository;

import com.example.demo.model.usuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface usuariosRepository extends JpaRepository<usuariosModel, Integer> {
    public usuariosModel findByCPF(String CPF);

    public List<usuariosModel> findByNOME(String NOME);

    @Query(value = "SELECT * FROM BRADLEY_USUARIO WHERE upper(NOME) LIKE '%JAVA%'", nativeQuery = true)
    public List<usuariosModel> encontraPessoaJava();

    @Query(value = "SELECT * FROM BRADLEY_USUARIO WHERE NOME = ?1 AND   SEXO = ?2 AND   TIPO_SANGUINEO = ?3", nativeQuery = true)
    public List<usuariosModel> pesquisaPorCaracteristicas(String NOME, String SEXO, String TIPO_SANGUINEO);
    @Query(value = "SELECT * FROM bradley_usuario WHERE TRUNC((SYSDATE - DATA_NASCIMENTO) /365) > 18", nativeQuery = true)
    public List<usuariosModel> maiorDeIdade();
}
