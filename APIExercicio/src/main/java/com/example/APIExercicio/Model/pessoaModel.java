package com.example.APIExercicio.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Table(name = "EXERCICIO_BRADLEY_PESSOA")
@Entity
public class pessoaModel {
    @Id
    @Column(name = "id_pessoa")
    @NotNull
    int idPessoa;
    @Column(name = "nome")
    @NotNull
    @Size(max = 100, message = "O nome só pode ter 100 caracteres")
    String nome;
    @Column(name = "idade")
    @NotNull
    @Min(value = 18)
    int idade;
    @Column(name = "email")
    @NotNull
    @Email
    String email;
}