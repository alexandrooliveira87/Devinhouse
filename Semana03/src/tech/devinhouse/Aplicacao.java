package tech.devinhouse;

import tech.devinhouse.model.Operacao;
import tech.devinhouse.model.Tarefa;
import tech.devinhouse.repository.ArquivoRepository;
import tech.devinhouse.repository.TarefaRepository;
import tech.devinhouse.view.TarefaView;

import java.io.IOException;
import java.util.List;

public class Aplicacao {

    private TarefaView view = new TarefaView();
    private TarefaRepository repo = new TarefaRepository();

    public void executar() throws IOException {
        Operacao operacao = null;
        while (operacao == null || operacao != Operacao.SAIR) {
            view.exibirMenu();
            operacao = view.obterOpcao();
            processar(operacao);
        }
        System.out.println("Fim");
    }

    private void processar(Operacao operacao) throws IOException {
        if (operacao == null) {
            view.mostrarMensagem("Opção Inválida!");
            view.aguardar();
        } else if (operacao == Operacao.ADICIONAR) {
            Tarefa tarefa = view.obterDadosDeTarefa();
            tarefa = repo.adicionar(tarefa);
            view.mostrarMensagem("Tarefa adicionada com id = " + tarefa.getId());
            view.aguardar();
        } else if (operacao == Operacao.LISTAR) {
            List<Tarefa> tarefas = repo.obter();
            view.exibir(tarefas);
            view.aguardar();
        } else if (operacao == Operacao.EXCLUIR) {
            int id = view.obterIdDaTarefa();
            Tarefa tarefa = repo.obterPorId(id);
            boolean confirmado = view.confirmar(tarefa);
            if (confirmado) {
                repo.excluirTarefa(id);
                view.mostrarMensagem("Tarefa Excluida!");
            }
            view.aguardar();
        } else if (operacao == Operacao.LISTAR_POR_ID) {
            int id = view.obterIdDaTarefa();
            Tarefa tarefa = repo.obterPorId(id);
            view.exibir(tarefa);
            view.aguardar();
        } else if (operacao == Operacao.MARCAR_CONCLUIDO) {
            int id = view.obterIdDaTarefa();
            Tarefa tarefa = repo.obterPorId(id);
            boolean confirmado = view.confirmar(tarefa);
            if (confirmado) {
                repo.marcarComoConcluida(id);
                view.mostrarMensagem("Tarefa indicada como concluĩda!");
            }
            view.aguardar();
        } else if (operacao == Operacao.EXPORTAR) {
            List<Tarefa> tarefas = repo.obter();
            ArquivoRepository.gerar("Tarefas.txt", tarefas);
            view.mostrarMensagem("Arquivo gerado!");
            view.aguardar();
        }
    }

}
