package map.operacoes_basicas.ex2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario() {
        palavras = new HashMap<>();
    }

    // Adiciona uma palavra e sua definição
    public void adicionarPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }

    // Remove uma palavra do dicionário
    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    // Exibe todas as palavras e suas definições
    public void exibirPalavras() {
        if (palavras.isEmpty()) {
            System.out.println("O dicionário está vazio.");
            return;
        }
        for (Map.Entry<String, String> entry : palavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Pesquisa uma palavra e retorna sua definição
    public String pesquisarPorPalavra(String palavra) {
        return palavras.getOrDefault(palavra, "Palavra não encontrada no dicionário.");
    }
}
