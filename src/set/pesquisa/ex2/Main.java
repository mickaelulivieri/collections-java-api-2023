package set.pesquisa.ex2;
/*
2. Lista de Tarefas
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
contarTarefas(): Conta o número total de tarefas na lista de tarefas.
obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
 */
public class Main {
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios");
        lista.adicionarTarefa("Comprar pão");

        System.out.println("Tarefas atuais:");
        lista.exibirTarefas();

        lista.marcarTarefaConcluida("Estudar Java");

        System.out.println("\nTarefas concluídas:");
        for (Tarefa t : lista.obterTarefasConcluidas()) {
            System.out.println(t);
        }

        System.out.println("\nTarefas pendentes:");
        for (Tarefa t : lista.obterTarefasPendentes()) {
            System.out.println(t);
        }

        lista.removerTarefa("Comprar pão");
        System.out.println("\nApós remover 'Comprar pão':");
        lista.exibirTarefas();

        System.out.println("\nTotal de tarefas: " + lista.contarTarefas());

        lista.limparListaTarefas();
        lista.exibirTarefas();
    }
}
