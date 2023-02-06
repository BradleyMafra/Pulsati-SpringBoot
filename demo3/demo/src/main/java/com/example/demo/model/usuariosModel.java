package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Criar GETS E SETS
@Table(name = "GIU_USUARIOS")
@Entity
public class usuariosModel {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "CPF")
    private String CPF;
    @Column(name = "SEXO")
    private String SEXO;
    @Column(name = "DATA_NASCIMENTO")
    private String DATA_NASCIMENTO;
    @Column(name = "TIPO_SANGUINEO")
    private String TIPO_SANGUINEO;
    @Column(name = "EMAIL")
    private String EMAIL;
}
