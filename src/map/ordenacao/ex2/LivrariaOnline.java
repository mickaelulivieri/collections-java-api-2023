package map.ordenacao.ex2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LivrariaOnline {

    public static class Livro {
        private String titulo;
        private String autor;
        private double preco;

        public Livro(String titulo, String autor, double preco) {
            this.titulo = titulo;
            this.autor = autor;
            this.preco = preco;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "título='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", preço=R$ " + preco +
                    '}';
        }
    }

    private Map<String, Livro> livros;

    public LivrariaOnline() {
        livros = new HashMap<>();
    }

    // Adiciona um livro pelo link
    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        livros.put(link, livro);
    }

    // Remove um livro dado o título
    public boolean removerLivro(String titulo) {
        String keyToRemove = null;
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                keyToRemove = entry.getKey();
                break;
            }
        }
        if (keyToRemove != null) {
            livros.remove(keyToRemove);
            return true;
        }
        return false;
    }

    // Exibe os livros ordenados por preço crescente
    public void exibirLivrosOrdenadosPorPreco() {
        List<Livro> ordenados = livros.values()
                .stream()
                .sorted(Comparator.comparingDouble(Livro::getPreco))
                .collect(Collectors.toList());

        if (ordenados.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
            return;
        }

        ordenados.forEach(System.out::println);
    }

    // Retorna lista de livros do autor especificado
    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        return livros.values()
                .stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    // Retorna o livro mais caro
    public Livro obterLivroMaisCaro() {
        return livros.values()
                .stream()
                .max(Comparator.comparingDouble(Livro::getPreco))
                .orElse(null);
    }

    // Retorna o livro mais barato
    public Livro exibirLivroMaisBarato() {
        return livros.values()
                .stream()
                .min(Comparator.comparingDouble(Livro::getPreco))
                .orElse(null);
    }
}
