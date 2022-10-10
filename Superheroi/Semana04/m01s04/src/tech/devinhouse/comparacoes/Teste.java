package tech.devinhouse.comparacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Gato garfield = new Gato("garfield", 5);
        Gato gatoDeBotas = new Gato("gato de botas", 3);

        int resultado = garfield.compareTo(gatoDeBotas);
        System.out.println("Resultado : " + resultado);

        List<Gato> gatos = new ArrayList<>();
        gatos.add(gatoDeBotas);
        gatos.add(garfield);

        Collections.sort(gatos);

        System.out.println("Ordenado pelo nome:" + gatos); // ordenado com Comparable (nome)

        Collections.sort(gatos, new IdadeComparator());

        System.out.println("Ordenado pela idade:" + gatos);

    }

}
