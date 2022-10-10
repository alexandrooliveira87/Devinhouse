package com.devinhouse.construtores;

public class Gato {

    public Gato() {   // construtor padrão/default
    }

    public Gato(String nome, Integer idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public Gato(String nome) {
        this(nome, null, 0);
    }

    public Gato(String nome, Integer idade) {
        this(nome, idade, 0);
    }

    private String nome;
    private Integer idade;
    private float peso;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
