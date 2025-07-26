package map.operacoes_basicas.ex1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    // Adiciona ou atualiza o telefone de um contato
    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
        System.out.println("Contato '" + nome + "' adicionado/atualizado com o telefone: " + telefone);
    }

    // Remove um contato pelo nome
    public void removerContato(String nome) {
        if (contatos.remove(nome) != null) {
            System.out.println("Contato '" + nome + "' removido.");
        } else {
            System.out.println("Contato '" + nome + "' não encontrado.");
        }
    }

    // Exibe todos os contatos
    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            System.out.println("Contatos na agenda:");
            for (Map.Entry<String, Integer> entry : contatos.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    // Pesquisa um contato pelo nome
    public Integer pesquisarPorNome(String nome) {
        return contatos.getOrDefault(nome, null);
    }
}
