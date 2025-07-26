package map.pesquisa.ex1;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    // Classe Produto interna
    public static class Produto {
        private String nome;
        private int quantidade;
        private double preco;

        public Produto(String nome, int quantidade, double preco) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPreco() {
            return preco;
        }

        public double getValorTotal() {
            return quantidade * preco;
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "nome='" + nome + '\'' +
                    ", quantidade=" + quantidade +
                    ", preco=" + preco +
                    '}';
        }
    }

    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        estoque = new HashMap<>();
    }

    // Adiciona produto ao estoque
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        Produto produto = new Produto(nome, quantidade, preco);
        estoque.put(cod, produto);
    }

    // Exibe todos os produtos com quantidade e preço
    public void exibirProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }
        for (Map.Entry<Long, Produto> entry : estoque.entrySet()) {
            long codigo = entry.getKey();
            Produto p = entry.getValue();
            System.out.println("Código: " + codigo + ", Nome: " + p.getNome() +
                    ", Quantidade: " + p.getQuantidade() + ", Preço: R$ " + p.getPreco());
        }
    }

    // Calcula valor total do estoque
    public double calcularValorTotalEstoque() {
        double total = 0.0;
        for (Produto p : estoque.values()) {
            total += p.getValorTotal();
        }
        return total;
    }

    // Retorna o produto mais caro
    public Produto obterProdutoMaisCaro() {
        Produto maisCaro = null;
        for (Produto p : estoque.values()) {
            if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
        }
        return maisCaro;
    }

    // Retorna o produto mais barato
    public Produto obterProdutoMaisBarato() {
        Produto maisBarato = null;
        for (Produto p : estoque.values()) {
            if (maisBarato == null || p.getPreco() < maisBarato.getPreco()) {
                maisBarato = p;
            }
        }
        return maisBarato;
    }

    // Retorna o produto com maior valor total no estoque (quantidade * preço)
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto maiorValorTotal = null;
        for (Produto p : estoque.values()) {
            if (maiorValorTotal == null || p.getValorTotal() > maiorValorTotal.getValorTotal()) {
                maiorValorTotal = p;
            }
        }
        return maiorValorTotal;
    }
}
