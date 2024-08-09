package me.dio.web.lab03.operadores;


public class OperadoresTernario {

	public static void main(String[] args) {
		/*** 
		 * Ternário
		 * Equivale a um IF, porém escrita em uma única linha
		 * Representado pelo simbolo ?:
		 * <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
		 */
		int a, b;
		a = 5;
		b = 6;
		String resultado;
		if(a==b)
			resultado = "verdadeiro";
		else
			resultado = "falso";
		
		System.out.println(resultado);
		
		//Mesma condicional, utilizando o operador Ternário
		String resultado2 = (a==b) ? "verdadeiro" : "falso";
		System.out.println(resultado2);
	}
	
}
