package com.devinhouse.statics;

public class TesteStatics {


    public static void main(String[] args) {
        Animal cachorro = new Animal("Cachorro");
        Animal gato = new Animal("Gato");
        Animal leao = new Animal("Leão");

        Integer teste = Animal.contador;
        Integer outroTeste= cachorro.contador;  // incomum usar assim

        System.out.println( Animal.contador );         // atributo da classe / estatico
        System.out.println( Animal.valorEstatico );    // atributo da classe / estatico
        System.out.println( cachorro.nome + " - " + cachorro.contador );  // atributo da classe acessado por uma instância
        System.out.println( gato.nome + " - " + gato.contador );      // atributo da classe acessado por outro instância (mesmo valor)

        System.out.println( Animal.andar() );
    }


}
