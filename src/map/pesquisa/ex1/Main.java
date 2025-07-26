package map.pesquisa.ex1;
/*
1. Estoque de Produtos com Preço
Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preços.
calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
 */
public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(101, "Teclado", 10, 150.0);
        estoque.adicionarProduto(102, "Mouse", 20, 50.0);
        estoque.adicionarProduto(103, "Monitor", 5, 900.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior valor total no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
