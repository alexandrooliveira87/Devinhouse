package com.devinhouse.praticas;

public class TestePessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Tiago");
        pessoa.setSobrenome("Albuquerque");

//        System.out.println( pessoa.getNome() );
//        System.out.println( pessoa.getSobrenome() );
//        System.out.println( pessoa.getIdade() );

        String nomeCompleto = pessoa.obterNomeCompleto();
        System.out.println(nomeCompleto);

        pessoa.setIdade(20);
        System.out.println( pessoa.obterIdadeEmMeses() );

    }

}
