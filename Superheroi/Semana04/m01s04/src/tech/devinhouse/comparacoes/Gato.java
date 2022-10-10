package tech.devinhouse.comparacoes;

import java.time.LocalDate;

public class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private LocalDate dataDeCadastro;


    public Gato(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.dataDeCadastro = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato other) {  // negativo, 0, positivo
        /*
           comparacao natural programada como sendo
           ordem alfabética de nome do gato
         */
        return this.nome.compareTo(other.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
}
