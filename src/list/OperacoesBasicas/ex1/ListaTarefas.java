package list.OperacoesBasicas.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getDescricao().equals(descricao)) {
                tarefas.remove(i);
                break;
            }
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<>();
        for (int i = 0; i < tarefas.size(); i++) {
            descricoes.add(tarefas.get(i).getDescricao());
        }
        return descricoes;
    }

}