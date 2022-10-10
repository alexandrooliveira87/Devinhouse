package com.devinhouse.exercicios.ex01;

public class Funcionario {

    private Long cpf;
    private String nome;
    private Float salario;

    public void promover(float percentual) {
        float perc  = percentual / 100;
        this.salario = this.salario * (1 + perc);
    }


    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
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
