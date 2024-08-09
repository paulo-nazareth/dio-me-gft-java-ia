package me.dio.web.lab05.estrutura_do_while;

import java.util.Random;

public class DoWhile {
	/**
	 * #Estrutura do controle de fluxo do while
	 * do {
	 * // comando que será executado até que a expressão de validação torne-se falsa
	 * } while (expressão booleana de validação);
	 */
	public static void main(String[] args) {
		System.out.println("Discando...");
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		}while(tocando());
		System.out.println("Alô !!!");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//Negando o ato de continuar tocando
		return !atendeu;
	}
}