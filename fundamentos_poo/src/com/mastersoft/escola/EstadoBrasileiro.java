package com.mastersoft.escola;

//Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {

	SAO_PAULO ("SP","São Paulo",11L),
	RIO_JANEIRO ("RJ", "Rio de Janeiro",12L),
	PIAUI ("PI", "Piauí",13L),
	MARANHAO ("MA","Maranhão",14L);

	private String nome;

	private String sigla;

	private Long ibge;

	private EstadoBrasileiro(String sigla, String nome, Long ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}

	public Long getIbge() {
		return ibge;
	}

	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}