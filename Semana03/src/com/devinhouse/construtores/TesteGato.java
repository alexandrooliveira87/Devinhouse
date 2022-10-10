package com.devinhouse.construtores;

public class TesteGato {

    public static void main(String[] args) {

//        Gato gatoConstrutorPadrao = new Gato();
//        gatoConstrutorPadrao.setNome("garfield");

        Gato gatoComNomeSetado = new Gato("garfield", 5, 5);
        System.out.println( gatoComNomeSetado.getNome() );

        Gato gatoComNome = new Gato("Tom");

    }
}
