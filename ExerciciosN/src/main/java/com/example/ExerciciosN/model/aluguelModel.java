package com.example.ExerciciosN.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Table(name = "aluguel_bradley")
@Entity
public class aluguelModel {
    @Id
    @Column(name = "id")
    int id;
    @Column(name = "data_aluguel")
    Date data_aluguel;
    @JoinColumn(name = "id_livro", referencedColumnName = "id")
    @ManyToOne
    private livroModel livro;
}
