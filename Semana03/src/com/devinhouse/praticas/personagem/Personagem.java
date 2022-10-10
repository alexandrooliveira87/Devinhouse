package com.devinhouse.praticas.personagem;

import java.time.LocalDate;

public class Personagem {

    private String nome;
    private String referencia;
    private int idade;
    private LocalDate dataCadastramento;

    public String obterNomeEmMaiusculo() {
        return nome.toUpperCase();
    }

    public String obterTresPrimeirasLetrasDoNome() {
        return nome.substring(0, 3);
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", referencia='" + referencia + '\'' +
                ", idade=" + idade +
                ", dataCadatramento=" + dataCadastramento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataCadastramento() {
        return dataCadastramento;
    }

    public void setDataCadastramento(LocalDate dataCadastramento) {
        this.dataCadastramento = dataCadastramento;
    }

}
