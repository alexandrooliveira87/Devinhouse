package tech.devinhouse.excecoes;

public class GarfieldException extends Exception {

    public GarfieldException() {
        super("Garfield ficou chateado e lançou excecao!");
    }

    public GarfieldException(String valor) {
        super("Garfield viu o valor: " + valor);
    }

}
