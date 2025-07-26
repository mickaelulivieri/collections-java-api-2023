package map.ordenacao.ex2;

import java.util.List;

/*
2. Livraria Online
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
 */
public class Main {
    public static void main(String[] args) {
        LivrariaOnline loja = new LivrariaOnline();

        loja.adicionarLivro("https://amazon.com/livro1", "Java Básico", "Maria Silva", 59.90);
        loja.adicionarLivro("https://amazon.com/livro2", "Python Avançado", "João Souza", 75.50);
        loja.adicionarLivro("https://amazon.com/livro3", "Java Básico", "Maria Silva", 55.00);
        loja.adicionarLivro("https://amazon.com/livro4", "C# para Iniciantes", "Ana Costa", 45.00);

        System.out.println("Livros ordenados por preço:");
        loja.exibirLivrosOrdenadosPorPreco();

        System.out.println("\nLivros da Maria Silva:");
        List<LivrariaOnline.Livro> livrosMaria = loja.pesquisarLivrosPorAutor("Maria Silva");
        livrosMaria.forEach(System.out::println);

        System.out.println("\nLivro mais caro:");
        System.out.println(loja.obterLivroMaisCaro());

        System.out.println("\nLivro mais barato:");
        System.out.println(loja.exibirLivroMaisBarato());

        System.out.println("\nRemovendo livro 'Java Básico':");
        boolean removido = loja.removerLivro("Java Básico");
        System.out.println("Removido? " + removido);

        System.out.println("\nLivros após remoção:");
        loja.exibirLivrosOrdenadosPorPreco();
    }
}