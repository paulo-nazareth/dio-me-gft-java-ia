package me.dio.web.lab06.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtos;

	public CadastroProdutos() {
		this.produtos = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
		produtos.add(new Produto(nome, codigo, preco, quantidade));
	}

	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtoPorNome = new TreeSet<>(produtos);
		return produtoPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtoPorNome = new TreeSet<>(new ComparatorPorPreco());
		produtoPorNome.addAll(produtos);
		return produtoPorNome;
	}
	
	public static void main(String[] args) {
		// Criando uma instância do CadastroProdutos
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		// Adicionando produtos ao cadastro
		cadastroProdutos.adicionarProduto("Smartphone", 1L, 1000d, 10);
		cadastroProdutos.adicionarProduto("Notebook", 2L, 1500d, 5);
		cadastroProdutos.adicionarProduto("Mouse", 3L, 80d, 8);
		cadastroProdutos.adicionarProduto("Teclado", 4L, 50d, 15);
		
		// Exibindo todos os produtos no cadastro
		System.out.println(cadastroProdutos.produtos);
		
		// Exibindo produtos ordenados por nome
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		// Exibindo produtos ordenados por preço
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
}
