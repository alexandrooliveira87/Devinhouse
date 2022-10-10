package com.devinhouse.praticas.adivinhanumeros;

import java.util.Scanner;

public class Jogo {

    private final int min;
    private final int max;
    private final int sorteado;

    public Jogo(int min, int max, int sorteado) {
        this.min = min;
        this.max = max;
        this.sorteado = sorteado;
    }

    public void imprimirSaudacao() {
        System.out.println("Olá jogador! Bem vindo!");
        System.out.println("Eu escolhi um número e você tem que adivinhar!");
        System.out.println("O número é entre " + min + " e " + max);
        System.out.println();
    }

    public int pedirPalpite() {
        System.out.print("Qual o seu palpite? ");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        System.out.println();  // deixar linha em branco / pular linha
        return valor;
    }

    public boolean verificar(int palpite) {
        if (palpite == sorteado) {
            System.out.println("Parabéns, você acertou!");
            return true;
        }
        if (sorteado > palpite) {
            System.out.println("O número escolhido é maior que " + palpite);
        } else {
            System.out.println("O número escolhido é menor que " + palpite);
        }
        System.out.println("Tente novamente!");
        System.out.println();
        return false;
    }
}
