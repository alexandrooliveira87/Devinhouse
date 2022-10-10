package tech.devinhouse.repository;

import tech.devinhouse.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {

    private List<Tarefa> lista = new ArrayList<>();

    private static int idAtual = 0;

    public Tarefa adicionar(Tarefa tarefa) {
        tarefa.setId(++idAtual);
        lista.add(tarefa);
        return tarefa;
    }

    public List<Tarefa> obter() {
        return new ArrayList<>(lista); // cópia
    }

    public Tarefa obterPorId(int id) {
        for (Tarefa tarefa: lista) {
            if (tarefa.getId() == id)
                return tarefa;
        }
        return null;
    }

    public void excluirTarefa(int id) {
        List<Tarefa> atualizada = new ArrayList<>();
        for (Tarefa tarefa: lista) {
            if (tarefa.getId() == id)
                continue;
            atualizada.add(tarefa);
        }
        lista = atualizada;
    }

    public void marcarComoConcluida(int id) {
        for (Tarefa tarefa: lista) {
            if (tarefa.getId() == id) {
                tarefa.setConcluida(true);
                break;
            }
        }
    }


}
