package list.ordenacao_list.ex1;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas lista = new OrdenacaoPessoas();

        lista.adicionarPessoa("Ana", 25, 1.65);
        lista.adicionarPessoa("Bruno", 30, 1.80);
        lista.adicionarPessoa("Carlos", 20, 1.75);
        lista.adicionarPessoa("Diana", 28, 1.60);

        System.out.println("Lista original:");
        for (Pessoa p : lista.getPessoas()) {
            System.out.println(p);
        }

        System.out.println("\nOrdenado por idade:");
        lista.ordenarPorIdade();
        for (Pessoa p : lista.getPessoas()) {
            System.out.println(p);
        }

        System.out.println("\nOrdenado por altura:");
        lista.ordenarPorAltura();
        for (Pessoa p : lista.getPessoas()) {
            System.out.println(p);
        }
    }
}