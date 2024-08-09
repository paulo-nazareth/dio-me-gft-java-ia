package me.dio.web.lab03.operadores;

public class OperadoresAritmeticosExemplos {

	public static void main(String[] args) {
		int numero = 5;
//		numero = numero + 1;
//		numero++;
		System.out.println(numero++); //Exibe o número depois acrescenta +1
		System.out.println(++numero); //Acrescenta +1 depois imprime o número já atualizado
		
		//O mesmo se aplica ao decremento
		System.out.println(numero--); //Exibe o número depois decrementa +1
		System.out.println(numero);
		
		boolean variavel = true;
		variavel = !variavel; //Inverter o valor da variavel para false;
		System.out.println(variavel);
	}
	
}
