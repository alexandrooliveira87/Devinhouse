package tech.devinhouse.view;

import tech.devinhouse.model.Operacao;
import tech.devinhouse.model.Tarefa;

import java.util.List;
import java.util.Scanner;

public class TarefaView {

    public void exibirMenu() {
        System.out.println("** Lista de Tarefas **");
        System.out.println();
        System.out.println("-------- MENU --------");
        System.out.println();
        System.out.println("1 - Adicionar Tarefa");
        System.out.println("2 - Excluir Tarefa");
        System.out.println("3 - Consultar Tarefas");
        System.out.println("4 - Consultar Tarefas por id");
        System.out.println("5 - Marcar tarefa como concluída");
        System.out.println("6 - Exportar para arquivo");
        System.out.println("7 - Sair");
        System.out.println();
    }

    public Operacao obterOpcao() {
        System.out.print("Escolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        System.out.println();
        Operacao operacao = Operacao.obterPeloCodigo(opcao);
        return operacao;
    }

    public void aguardar() {
        System.out.println("Pressione qualquer tecla para continuar... ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println();
    }

    public Tarefa obterDadosDeTarefa() {
        System.out.println("Informe o texto da tarefa: ");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        System.out.println();
        Tarefa tarefa = new Tarefa(texto);
        return tarefa;
    }

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
        System.out.println();
    }

    public void exibir(Tarefa tarefa) {
        System.out.println(tarefa);
        System.out.println();
    }

    public void exibir(List<Tarefa> tarefas) {
        for (Tarefa tarefa: tarefas) {
            System.out.println(tarefa);
        }
        System.out.println();
    }

    public int obterIdDaTarefa() {
        System.out.print("Informe o ID da tarefa: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println();
        return id;
    }

    public boolean confirmar(Tarefa tarefa) {
        exibir(tarefa);
        System.out.print("Confirma operação para esta tarefa [s/n]: ");
        Scanner scanner = new Scanner(System.in);
        String resp = scanner.next();
        System.out.println();
        return resp.toLowerCase().equals("s");
    }
}
