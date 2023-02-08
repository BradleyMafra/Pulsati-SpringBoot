package com.example.APITarefas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;
@Data
@Table(name = "tarefas")
@Entity
public class tarefaModel {
    @Id
    @Column(name = "ID_TAREFA")
    int ID_TAREFA;
    @Column(name = "NOME_TAREFA")
    String NOME_TAREFA;
    @Column(name = "DESCRICAO_TAREFA")
    String DESCRICAO_TAREFA;
    @Column(name = "DATA_INICIO")
    Date DATA_INICIO;
    @Column(name = "STATUS")
    String STATUS;
    @Column(name = "PRIORIDADE")
    int PRIORIDADE;
}
