package me.dio.web.lab03.operadores;

public class OperadoresAritmeticos {

	/*** 
	 * Unário
	 * Operador unários, são aplicados juntamente com outro operador aritmético. 
	 * É utilizado para realizar alguns trabalhos básicos como incrementar, decrementar, inverter valores númericos e booleanos.
	 * (+) - Positivo
	 * (-) - Negativo
	 * (++) - Incremento
	 * (--) - Decremento
	 * (!) - Lógico de Negação (nega o valor de uma expressão booleana.
	 * */
	
	public static void main(String[] args) {
		int numero = 5;
		numero = - numero;
		//Resultado negativo
		System.out.println(numero);

		numero = + numero;
		//Resultado continua negativo
		System.out.println(numero);
		
		numero = numero * -1;
		//Resultado positivo novamente (foi necessário uma multiplicação)
		System.out.println(numero);
	}
	
}
