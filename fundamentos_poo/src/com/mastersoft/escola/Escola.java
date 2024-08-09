package com.mastersoft.escola;

public class Escola {
	
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setSexo("Masculino");
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 
		
		//Exemplo de Instanciando Classe Construtor Com Parametros
		Aluno marcos = new Aluno("Marcos", 13);
		System.out.println("O aluno " + marcos.getNome() + " tem " + marcos.getIdade() + " anos ");
		
		//Utilização de Enum - Listar Estados Pré-existentes
		for(EstadoBrasileiro eb : EstadoBrasileiro.values()) {
			System.out.println(eb.getSigla() + " - " + eb.getNome());
		}

		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
		System.out.println("Selecionando um Estado Específico: " + eb.getSigla() + " - " + eb.getNome());
		System.out.println("Código IBGE: " + eb.getIbge());
	}
	
}
