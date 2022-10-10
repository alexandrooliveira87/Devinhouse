package com.devinhouse.finals;

public class TestesFinals {

    public static void main(String[] args) {

        final String valor = "teste";
//        valor = "outro valor";  // nao consigo mudar pq final indica que é uma constante

        Pessoa pessoa = new Pessoa("James", "Kirk");
//        pessoa.nome = "Spock";  // nao compila, atributo final


    }

}
