package me.dio.web.lab01.estrutura_for;

public class EstruturaFor {

	/**
	 * #estrutura do controle de fluxo for
	 * for (bloco de inicialização; expressão booleana de validação; bloco de atualização) {
	 *      //comando que será executado até que a expressão de validação torne-se falsa 
	 * }
	 * */
	
	public static void main(String[] args) {
		//Exemplo de Estrutura 1
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
		
		//Exemplo de Estrutura 2
		//O que importa é somente o bloco condicional
		int carneirinhos = 1;
		for( ; carneirinhos <=20; ) {
		     System.out.println(carneirinhos + " - Carneirinho(s)");
		     carneirinhos ++;
		}
	}
	
}
