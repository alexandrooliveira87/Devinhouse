package com.devinhouse.desafios;

public class TesteDaCalculadoraDeGorjetas {

    public static void main(String[] args) {
        CalculadoraDeGorjetas calculadora = new CalculadoraDeGorjetas();
        calculadora.setValorDaConta(1000f);
        calculadora.setPercentualGorjeta(10f);
        float resultado = calculadora.calcularValorDaGorjeta();
        System.out.println("A gorjeta é de : R$ " + resultado);
    }

}
