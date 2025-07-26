package list.pesquisa_list.Ex1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionando livros
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        catalogo.adicionarLivro("Memórias Póstumas", "Machado de Assis", 1881);
        catalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        // Pesquisando por autor
        List<Livro> porAutor = catalogo.pesquisarPorAutor("Machado de Assis");
        System.out.println("Livros de Machado de Assis: " + porAutor);

        // Pesquisando por intervalo de anos
        List<Livro> porIntervalo = catalogo.pesquisarPorIntervaloAnos(1900, 2000);
        System.out.println("Livros publicados entre 1900 e 2000: " + porIntervalo);

        // Pesquisando por título
        Livro livro = catalogo.pesquisarPorTitulo("O Hobbit");
        System.out.println("Livro encontrado: " + livro);
    }
}
