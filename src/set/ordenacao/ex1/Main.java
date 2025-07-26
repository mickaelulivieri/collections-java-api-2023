package set.ordenacao.ex1;
/*
1. Cadastro de Produtos
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
 */

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(101, "Notebook", 3500.0, 5);
        cadastro.adicionarProduto(102, "Mouse", 80.0, 20);
        cadastro.adicionarProduto(103, "Teclado", 150.0, 15);
        cadastro.adicionarProduto(104, "Monitor", 1200.0, 8);

        cadastro.exibirProdutosPorNome();

        System.out.println();
        cadastro.exibirProdutosPorPreco();
    }
}