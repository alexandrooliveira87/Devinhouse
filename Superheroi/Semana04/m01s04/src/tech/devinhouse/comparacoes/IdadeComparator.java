package tech.devinhouse.comparacoes;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) { // negativo, zero, positivo
        // ordem de comparacao é a idade dos gatos
        return g1.getIdade().compareTo(g2.getIdade());
    }

}
