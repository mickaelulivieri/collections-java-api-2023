package list.OperacoesBasicas.ex2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getNome().equals(nome)) {
                itens.remove(i);
                break;
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).getPreco() * itens.get(i).getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i);
            System.out.println("- " + item.getNome() + " | Preço: R$" + item.getPreco() + " | Quantidade: " + item.getQuantidade());
        }
    }
}
