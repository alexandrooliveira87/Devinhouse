package com.devinhouse.exercicios.ex02;

public class Funcionario {

    private String nome;
    private Float salario;


    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public void aumentar(Float valor) {
        if (salario == null) {
            salario = 0f;
        }
        salario += valor;
    }

    public void aumentar(Float valor, Float comissao) {
        if (salario == null) {
            salario = 0f;
        }
        salario += (valor + comissao);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
