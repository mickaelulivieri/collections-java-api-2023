package map.ordenacao.ex1;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    // Classe Evento com nome e atração
    public static class Evento {
        private String nome;
        private String atracao;

        public Evento(String nome, String atracao) {
            this.nome = nome;
            this.atracao = atracao;
        }

        public String getNome() {
            return nome;
        }

        public String getAtracao() {
            return atracao;
        }

        @Override
        public String toString() {
            return "Evento{" +
                    "nome='" + nome + '\'' +
                    ", atração='" + atracao + '\'' +
                    '}';
        }
    }

    private TreeMap<LocalDate, Evento> agenda;

    public AgendaEventos() {
        agenda = new TreeMap<>();
    }

    // Adiciona evento na data
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        agenda.put(data, evento);
    }

    // Exibe todos os eventos em ordem crescente de data
    public void exibirAgenda() {
        if (agenda.isEmpty()) {
            System.out.println("Agenda vazia.");
            return;
        }
        for (Map.Entry<LocalDate, Evento> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Retorna o próximo evento (menor data >= hoje)
    public Evento obterProximoEvento() {
        LocalDate hoje = LocalDate.now();

        // Busca a menor chave >= hoje
        Map.Entry<LocalDate, Evento> proximo = agenda.ceilingEntry(hoje);

        if (proximo != null) {
            return proximo.getValue();
        } else {
            System.out.println("Não há eventos futuros na agenda.");
            return null;
        }
    }
}
