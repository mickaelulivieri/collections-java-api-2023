package list.OperacoesBasicas.ex1;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        // Adicionando tarefas
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios");
        lista.adicionarTarefa("Ler um livro");

        // Exibindo total e descrições
        System.out.println("Total de tarefas: " + lista.obterNumeroTotalTarefas());
        System.out.println("Tarefas: " + lista.obterDescricoesTarefas());

        // Removendo uma tarefa
        lista.removerTarefa("Fazer exercícios");

        // Exibindo novamente
        System.out.println("Após remover uma tarefa:");
        System.out.println("Total de tarefas: " + lista.obterNumeroTotalTarefas());
        System.out.println("Tarefas: " + lista.obterDescricoesTarefas());
    }
}
