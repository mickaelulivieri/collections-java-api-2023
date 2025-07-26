package set.pesquisa.ex2;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover = t;
                break;
            }
        }
        if (tarefaRemover != null) {
            tarefas.remove(tarefaRemover);
            System.out.println("Tarefa '" + descricao + "' removida.");
        } else {
            System.out.println("Tarefa '" + descricao + "' não encontrada.");
        }
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            for (Tarefa t : tarefas) {
                System.out.println(t);
            }
        }
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (t.isConcluida()) {
                concluidas.add(t);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (!t.isConcluida()) {
                pendentes.add(t);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                System.out.println("Tarefa '" + descricao + "' marcada como concluída.");
                return;
            }
        }
        System.out.println("Tarefa '" + descricao + "' não encontrada.");
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                System.out.println("Tarefa '" + descricao + "' marcada como pendente.");
                return;
            }
        }
        System.out.println("Tarefa '" + descricao + "' não encontrada.");
    }

    public void limparListaTarefas() {
        tarefas.clear();
        System.out.println("Todas as tarefas foram removidas.");
    }
}
