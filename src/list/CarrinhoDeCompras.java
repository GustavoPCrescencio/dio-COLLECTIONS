package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaParaRemoverItem = new ArrayList<>();
        for(Item n : carrinho) {
            if(n.getNome().equalsIgnoreCase(nome)) {
                listaParaRemoverItem.add(n);
            }
        }
        carrinho.removeAll(listaParaRemoverItem);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for(Item v : carrinho) {
            valorTotal += (v.getPreco() * v.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("PS5", 4000, 2);
        carrinho.adicionarItem("PS4", 2000, 4);
        carrinho.adicionarItem("PS3", 1000, 6);
        carrinho.adicionarItem("PS2", 500, 1);
        carrinho.exibirItens();
        System.out.println("valor do carrinho: R$" + carrinho.calcularValorTotal());
        carrinho.removerItem("PS5");
        carrinho.exibirItens();
        System.out.println("valor do carrinho: R$" + carrinho.calcularValorTotal());
    }
}
