package org.devinhouse.semana04.model;

public enum Operacao {
    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Operacao obterPeloCodigo(int codigo) {
        Operacao[] operacoes = Operacao.values();
        return operacoes[codigo-1];
    }

}
