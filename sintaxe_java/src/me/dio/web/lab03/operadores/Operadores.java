package me.dio.web.lab03.operadores;

import java.util.Date;

public class Operadores {

	/*** 
	 * Atribuição
	 * Operador de Atribuição representado pelo simbolo = 
	 * É utilizado para definir o valor ou sobrescrever o valor de uma variável
	 * */
	//EXEMPLOS
	String nome = "Paulo";
	int idade = 22;
	double peso = 68.5;
	char sexo = 'M';
	boolean doadorOrgao = false;
	Date dataNascimento = new Date();
	
	/*** 
	 * Artimético
	 * Operador Artimético representado pelos simbolos + (adição), - (subtração), * (multiplicação) e / (divisão). 
	 * É utilizado para realizar operações matemáticas entre valores numéricos
	 * */
	//EXEMPLOS
	double soma = 10.5 + 15.7;
	int subtracao = 113 - 25;
	int multiplicacao = 20 * 7;
//	int divisao = 15 / 3;
//	int modulo = 18 % 3; //Módulo resto inteiro de uma divisão
	double resultado = (10 * 7) + (20 / 4);
	//Operador de adição quando utilizado em variáveis do tipo texto, realizá a concatenação de textos;
	String nomeCompleto = "LINGUAGEM " + "JAVA";
	
}
