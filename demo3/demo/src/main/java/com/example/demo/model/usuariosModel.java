package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data // Criar GETS E SETS
@Table(name = "bradley_usuario")
@Entity
public class usuariosModel {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "CPF")
    private String CPF;
    @Column(name = "SEXO")
    private String SEXO;
    @Column(name = "DATA_NASCIMENTO")
    private Date DATA_NASCIMENTO;
    @Column(name = "TIPO_SANGUINEO")
    private String TIPO_SANGUINEO;
    @Column(name = "EMAIL")
    private String EMAIL;
}
