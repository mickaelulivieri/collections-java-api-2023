package list.OperacoesBasicas.ex3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> encontrados = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getAutor().equalsIgnoreCase(autor)) {
                encontrados.add(livros.get(i));
            }
        }
        return encontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> encontrados = new ArrayList<>();
        for (int i = 0; i < livros.size(); i++) {
            int ano = livros.get(i).getAnoPublicacao();
            if (ano >= anoInicial && ano <= anoFinal) {
                encontrados.add(livros.get(i));
            }
        }
        return encontrados;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return livros.get(i);
            }
        }
        return null;
    }
}
