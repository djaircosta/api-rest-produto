package com.example;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Produto {
    private long id;
    private String nome;
    private Double preco;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }


   

    
    
}
