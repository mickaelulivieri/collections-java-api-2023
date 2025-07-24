package list.OperacoesBasicas.ex2;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens
        carrinho.adicionarItem("Notebook", 3500.0, 1);
        carrinho.adicionarItem("Mouse", 150.0, 2);
        carrinho.adicionarItem("Teclado", 200.0, 1);

        // Exibindo itens e total
        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();
        System.out.println("Valor total: R$" + carrinho.calcularValorTotal());

        // Removendo um item
        carrinho.removerItem("Mouse");

        // Exibindo novamente
        System.out.println("\nApós remover um item:");
        carrinho.exibirItens();
        System.out.println("Valor total: R$" + carrinho.calcularValorTotal());
    }
}