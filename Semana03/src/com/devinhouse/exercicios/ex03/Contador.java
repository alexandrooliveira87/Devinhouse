package com.devinhouse.exercicios.ex03;

import java.util.StringTokenizer;

public class Contador {

    public static void contarPalavras(String frase) {
        String[] palavras = frase.split(" "); // usando metodo split de string
        int qtdPalavras = palavras.length;
//        StringTokenizer tokens = new StringTokenizer(frase);  // usando classe StringTokenizer
//        int qtdPalavras2 = tokens.countTokens();
        System.out.println("Qtd de palavras = " + qtdPalavras);
//        System.out.println("Qtd de palavras = " + qtdPalavras2);
    }

}
