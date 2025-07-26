package set.pesquisa.ex1;
/*
1. Agenda de Contatos
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

adicionarContato(String nome, int numero): Adiciona um contato à agenda.
exibirContatos(): Exibe todos os contatos da agenda.
pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de um contato específico.
 */
public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Ana", 1111);
        agenda.adicionarContato("Bruno", 2222);
        agenda.adicionarContato("Carlos", 3333);
        agenda.adicionarContato("Ana", 5555); // Ignorado (mesmo nome, não duplica)

        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        System.out.println("\nPesquisando contatos com nome 'Ana':");
        for (Contato c : agenda.pesquisarPorNome("Ana")) {
            System.out.println(c);
        }

        System.out.println("\nAtualizando número de Bruno...");
        agenda.atualizarNumeroContato("Bruno", 9999);

        System.out.println("\nAgenda após atualização:");
        agenda.exibirContatos();

        System.out.println("\nTentando atualizar número de João (não existe):");
        agenda.atualizarNumeroContato("João", 1234);
    }
}

