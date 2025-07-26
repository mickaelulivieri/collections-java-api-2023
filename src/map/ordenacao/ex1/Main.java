package map.ordenacao.ex1;

import java.time.LocalDate;

/*
1. Agenda de Eventos
Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
obterProximoEvento(): Retorna o próximo evento que ocorrerá.
 */
public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2025, 8, 10), "Festa Junina", "Banda X");
        agenda.adicionarEvento(LocalDate.of(2025, 7, 30), "Show de Rock", "Banda Y");
        agenda.adicionarEvento(LocalDate.of(2025, 7, 26), "Feira Cultural", "Atração Z");

        agenda.exibirAgenda();

        AgendaEventos.Evento proximo = agenda.obterProximoEvento();
        if (proximo != null) {
            System.out.println("Próximo evento: " + proximo);
        }
    }
}
