package com.devinhouse.enums;

public class TesteCafe {

    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        cafe.setTipo("expresso");
        cafe.setTamanho(Tamanho.MEDIO);  // enum tamanho

        System.out.println(cafe);

    }
}
