package com.devinhouse.exercicios.ex01;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(12345678901L);
        funcionario.setNome("Ozzy Osbourne");
        funcionario.setSalario(10_000.0f);
        funcionario.promover(20);
        System.out.println(funcionario.getSalario());

    }
}
