package map.pesquisa.ex2;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagem;

    public ContagemPalavras() {
        contagem = new HashMap<>();
    }

    // Adiciona uma palavra e sua contagem (se já existe, soma a nova contagem)
    public void adicionarPalavra(String palavra, Integer quantidade) {
        contagem.put(palavra, contagem.getOrDefault(palavra, 0) + quantidade);
    }

    // Remove uma palavra da contagem, se existir
    public void removerPalavra(String palavra) {
        contagem.remove(palavra);
    }

    // Exibe todas as palavras e suas contagens
    public void exibirContagemPalavras() {
        if (contagem.isEmpty()) {
            System.out.println("Nenhuma palavra registrada.");
            return;
        }
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Encontra a palavra mais frequente e retorna uma String com palavra e contagem
    public String encontrarPalavraMaisFrequente() {
        if (contagem.isEmpty()) {
            return "Nenhuma palavra registrada.";
        }
        String palavraMaisFrequente = null;
        int maxContagem = 0;
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            if (palavraMaisFrequente == null || entry.getValue() > maxContagem) {
                palavraMaisFrequente = entry.getKey();
                maxContagem = entry.getValue();
            }
        }
        return "Palavra mais frequente: '" + palavraMaisFrequente + "' com " + maxContagem + " ocorrências.";
    }
}
