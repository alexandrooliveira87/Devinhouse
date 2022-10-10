package tech.devinhouse.model;

public enum Operacao {

    ADICIONAR,
    EXCLUIR,
    LISTAR,
    LISTAR_POR_ID,
    MARCAR_CONCLUIDO,
    EXPORTAR,
    SAIR;

    public static Operacao obterPeloCodigo(int codigo) {
        Operacao[] operacoes = Operacao.values();
        if (codigo > operacoes.length || codigo < 0) {
            return null;
        }
        return operacoes[codigo-1];
    }

}
