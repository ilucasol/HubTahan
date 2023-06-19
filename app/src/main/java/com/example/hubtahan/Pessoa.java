package com.example.hubtahan;

public class Pessoa {

    private String nome;
    private Double resultado;

    public Pessoa(String nome, Double resultado) {
        this.nome = nome;
        this.resultado = resultado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString(){
    return nome + ": " + resultado;

    }

}
