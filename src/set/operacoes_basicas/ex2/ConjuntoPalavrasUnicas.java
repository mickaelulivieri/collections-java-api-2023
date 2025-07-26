package set.operacoes_basicas.ex2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    // Adiciona uma palavra ao conjunto (não permite duplicadas)
    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    // Remove uma palavra do conjunto
    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    // Verifica se uma palavra está presente no conjunto
    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    // Exibe todas as palavras únicas
    public void exibirPalavrasUnicas() {
        if (palavras.isEmpty()) {
            System.out.println("Nenhuma palavra no conjunto.");
        } else {
            for (String palavra : palavras) {
                System.out.println(palavra);
            }
        }
    }
}