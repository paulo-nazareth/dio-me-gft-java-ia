package me.dio.web.lab01.lists.operacoes_basicas.hands_on;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> listaDeItens;

	public CarrinhoDeCompras() {
		this.listaDeItens =  new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		listaDeItens.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> listaItemRemover = new ArrayList<>();
		for(Item item : listaDeItens) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				listaItemRemover.add(item);
			}
		}
		listaDeItens.removeAll(listaItemRemover);
	}

	public double calcularValorTotal() {
		double total = 0;
		for(Item item : listaDeItens) {
			total += item.getPreco() * item.getQuantidade();
		}
		return total;
	}

	public void exibirItens() {
//		double totalCompra = 0;
		for (int i = 0; i < listaDeItens.size(); i++) {
			System.out.println(String.format("Item %s - %s (%s x R$ %s = R$ %.2f)", 					
					  (i+1)
					, listaDeItens.get(i).getNome() 
					, listaDeItens.get(i).getQuantidade()
					, listaDeItens.get(i).getPreco()
					, (listaDeItens.get(i).getQuantidade() * listaDeItens.get(i).getPreco())));
//			totalCompra += listaDeItens.get(i).getQuantidade() * listaDeItens.get(i).getPreco();
		}
		System.out.println("------------------------------------------"); 
		System.out.printf("Valor Total da Compra R$ %.2f", calcularValorTotal()); 
	}

	public static void main(String[] args) {
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		compras.adicionarItem("Biscoito", 2.99, 2);
		compras.adicionarItem("Picanha", 38.37, 1);
		compras.exibirItens();
	}
}
