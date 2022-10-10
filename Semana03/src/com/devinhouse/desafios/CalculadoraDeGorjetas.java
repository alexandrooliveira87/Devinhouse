package com.devinhouse.desafios;

public class CalculadoraDeGorjetas {

    private float valorDaConta;

    private float percentualGorjeta;


    public float calcularValorDaGorjeta() {
        return valorDaConta * (percentualGorjeta / 100);
    }


    public float getValorDaConta() {
        return valorDaConta;
    }
    public void setValorDaConta(float valorDaConta) {
        this.valorDaConta = valorDaConta;
    }
    public float getPercentualGorjeta() {
        return percentualGorjeta;
    }
    public void setPercentualGorjeta(float percentualGorjeta) {
        this.percentualGorjeta = percentualGorjeta;
    }

}
