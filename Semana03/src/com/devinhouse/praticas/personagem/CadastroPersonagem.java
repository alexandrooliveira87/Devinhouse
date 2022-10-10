package com.devinhouse.praticas.personagem;

import java.time.LocalDate;
import java.util.Scanner;

public class CadastroPersonagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();  // linha para pegar mais de um token de palavra
        System.out.println("Informe a referência: ");
        String referencia = scanner.next();
        System.out.println("Informe a idade: ");
        int idade = scanner.nextInt();
        Personagem personagem = new Personagem();
        personagem.setNome(nome);
        personagem.setReferencia(referencia);
        personagem.setIdade(idade);
        personagem.setDataCadastramento(LocalDate.now());
        System.out.println(personagem.obterNomeEmMaiusculo());
        System.out.println(personagem.obterTresPrimeirasLetrasDoNome());
        System.out.println(personagem);
    }
}
