package com.example.Contatos.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Table(name = "contatos")
@Entity
public class contatoModel {
    @Id
    @Column(name = "id_contato")
    int id_contato;
    @Column(name = "nome")
    String nome;
    @Column(name = "email")
    String email;
    @Column(name = "telefone")
    String telefone;
    @Column(name = "endereco")
    String endereco;
}
