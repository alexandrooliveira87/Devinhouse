package com.devinhouse.exercicios.ex02;

public class Teste {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("ozzy", 10_000f);
        funcionario.aumentar(100f);
        System.out.println(funcionario.getSalario());
    }
}
