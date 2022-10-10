package com.devinhouse.exercicios.ex04;

public class Contador2 {

    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public void contarPalavras() {
        String[] palavras = frase.split(" "); // usando metodo split de string
        int qtdPalavras = palavras.length;
//        StringTokenizer tokens = new StringTokenizer(frase);  // usando classe StringTokenizer
//        int qtdPalavras2 = tokens.countTokens();
        System.out.println("Qtd de palavras = " + qtdPalavras);
//        System.out.println("Qtd de palavras = " + qtdPalavras2);
    }

}
