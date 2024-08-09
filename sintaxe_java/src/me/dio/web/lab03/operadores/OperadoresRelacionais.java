package me.dio.web.lab03.operadores;


public class OperadoresRelacionais {

	/*** 
	 * Relacionais
	 * Realiza avaliações para definir se é igual, diferente, maior, menor ou igual.
	 * Retornam um resultado booleano
	 * == IGUAL
	 * != DIFERENTE
	 * >  MAIOR QUE
	 * >= MAIOR OU IGUAL
	 * <  MENOR QUE
	 * <= MENOR OU IGUAL
	 * 
	 */
	
	public static void main(String[] args) {
		int numero1 = 1;
		int numero2 = 2;
		
		if(numero1 > numero2)
			System.out.println("Numero 1 maior que numero 2");
		
		if(numero1 < numero2)
			System.out.println("Numero 1 menor que numero 2");
	
		//Para comparar objetos recomenda-se utilizar o EQUALS
		String nome1 = "Paulo";
		String nome2 = new String("Paulo");
		System.out.println(nome1.equals(nome2));
		
	}
	
}
