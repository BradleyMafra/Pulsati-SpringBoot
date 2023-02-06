package com.example.demo.model;

import lombok.Data;
@Data
public class pessoaModel {
    private int keep;
    private String going;
    private int brooh;

    pessoaModel(){}

    public pessoaModel(int keep, String going, int brooh){
        this.keep = keep;
        this.going =going;
        this.brooh = brooh;
    }
}
