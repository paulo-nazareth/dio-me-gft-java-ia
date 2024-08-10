package me.dio.web.lab02.lists.pesquisa;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livrosList;

	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		this.livrosList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public Livro pesquisarPorTitulo (String titulo){
		Livro livroTitulo = null;
		if(!livrosList.isEmpty()) {
			for(Livro livro : livrosList) {
				if(livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroTitulo = livro;
					break;
				}
			}
		}
		return livroTitulo;
	}

	public List<Livro> pesquisarPorAutor (String autor){
		List<Livro> livrosAutor = new ArrayList<>();
		if(!livrosList.isEmpty()) {
			for(Livro livro : livrosList) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosAutor.add(livro);
				}
			}
		}
		return livrosAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
		List<Livro> livrosIntervaloAnos = new ArrayList<>();
		if(!livrosList.isEmpty()) {
			for(Livro livro : livrosList) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livrosIntervaloAnos.add(livro);
				}
			}
		}
		return livrosIntervaloAnos;
	}

	public static void main(String[] args) {
	    // Criando uma instância do catálogo de livros
	    CatalogoLivros catalogoLivros = new CatalogoLivros();

	    // Adicionando livros ao catálogo
	    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
	    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
	    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
	    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

	    // Exibindo livros pelo mesmo autor
	    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

	    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
	    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

	    // Exibindo livros dentro de um intervalo de anos
	    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

	    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
	    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

	    // Exibindo livros por título
	    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

	    // Exibindo livros por título (caso em que não há livros com o título especificado)
	    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
	  }

}