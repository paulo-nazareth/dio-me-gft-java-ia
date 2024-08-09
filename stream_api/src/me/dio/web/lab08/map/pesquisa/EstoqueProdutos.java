package me.dio.web.lab08.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoqueProdutos;

	public EstoqueProdutos() {
		this.estoqueProdutos = new HashMap<>();
	}
	
	public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
		estoqueProdutos.put(codigo, new Produto(codigo, nome, preco, quantidade));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutos);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutos.isEmpty()) {
			for(Produto produto : estoqueProdutos.values()) {
				valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorValor = Double.MIN_VALUE;
		if(!estoqueProdutos.isEmpty()) {
			for(Produto produto : estoqueProdutos.values()) {
				if(produto.getPreco() > maiorValor) {
					maiorValor = produto.getPreco();
					produtoMaisCaro = produto;
				}
				
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorValor = Double.MAX_VALUE;
		if(!estoqueProdutos.isEmpty()) {
			for(Produto produto : estoqueProdutos.values()) {
				if(produto.getPreco() < menorValor) {
					menorValor = produto.getPreco();
					produtoMaisBarato = produto;
				}
				
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorTotal = null;
		double maiorValorQuantidade = Double.MIN_VALUE;
		if(!estoqueProdutos.isEmpty()) {
			for(Produto produto : estoqueProdutos.values()) {
				if(produto.getPreco() * produto.getQuantidade() > maiorValorQuantidade) {
					maiorValorQuantidade = produto.getPreco() * produto.getQuantidade();
					produtoMaiorQuantidadeValorTotal = produto;
				}
				
			}
		}
		return produtoMaiorQuantidadeValorTotal;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		// Exibe o estoque vazio
		estoque.exibirProdutos();
		
		// Adiciona produtos ao estoque
		estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
		estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
		estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
		estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
		
		// Exibe os produtos no estoque
		estoque.exibirProdutos();
		
		// Calcula e exibe o valor total do estoque
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
		
		// Obtém e exibe o produto mais caro
		Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
		System.out.println("Produto mais caro: " + produtoMaisCaro);
		
		// Obtém e exibe o produto mais barato
		Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
		System.out.println("Produto mais barato: " + produtoMaisBarato);
		
		// Obtém e exibe o produto com a maior quantidade em valor no estoque
		Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
		System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	}
}

