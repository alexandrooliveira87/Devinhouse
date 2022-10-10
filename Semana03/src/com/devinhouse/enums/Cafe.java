package com.devinhouse.enums;

import java.util.Objects;

public class Cafe {

    private String tipo;
    private Tamanho tamanho;


    @Override
    public String toString() {
        return "Cafe{" +
                "tipo='" + tipo + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }


    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Cafe outro = (Cafe) other;  // casting
        return this.tipo.equals(outro.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
}
