package set.pesquisa.ex1;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    // Adiciona um contato à agenda (evita duplicados pelo nome)
    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    // Exibe todos os contatos
    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            for (Contato c : contatos) {
                System.out.println(c);
            }
        }
    }

    // Pesquisa contatos pelo nome (parcial ou completo)
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> resultado = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    // Atualiza o número de um contato com base no nome
    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                System.out.println("Número atualizado para " + nome + ": " + novoNumero);
                return;
            }
        }
        System.out.println("Contato '" + nome + "' não encontrado na agenda.");
    }
}
