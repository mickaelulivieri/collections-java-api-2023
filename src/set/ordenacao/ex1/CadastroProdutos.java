package set.ordenacao.ex1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    // Adiciona produto ao cadastro
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    // Exibe produtos em ordem alfabética pelo nome
    public void exibirProdutosPorNome() {
        Set<Produto> ordenadosPorNome = new TreeSet<>(Comparator.comparing(Produto::getNome));
        ordenadosPorNome.addAll(produtos);

        if (ordenadosPorNome.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Produtos (ordenados por nome):");
            for (Produto p : ordenadosPorNome) {
                System.out.println(p);
            }
        }
    }

    // Exibe produtos em ordem crescente de preço
    public void exibirProdutosPorPreco() {
        Set<Produto> ordenadosPorPreco = new TreeSet<>(Comparator.comparingDouble(Produto::getPreco));
        ordenadosPorPreco.addAll(produtos);

        if (ordenadosPorPreco.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Produtos (ordenados por preço):");
            for (Produto p : ordenadosPorPreco) {
                System.out.println(p);
            }
        }
    }
}
