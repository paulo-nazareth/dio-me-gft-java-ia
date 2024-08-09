package me.dio.web.lab03.operadores;


public class OperadoresLogicos {

	/*** 
	 * Lógicos
	 * Representam recursos que permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões (Baseado na tabela verdade).
	 * && Operador Lógico "E"
	 * || Operador Lógico "OU"
	 */
	
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = true;
		
		if(condicao1 && condicao2) {
			System.out.println("As duas condições são verdadeiras");
		}
		
		if(condicao1 && condicao2 && (7>4)) { //Contendo uma expressão relacional
			System.out.println("As duas condições são verdadeiras");
		}
		
		if(condicao1 || condicao2) {
			System.out.println("Uma das duas condições é verdadeira!");
		}
	}
	
}
