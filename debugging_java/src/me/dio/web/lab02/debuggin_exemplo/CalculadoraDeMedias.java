package me.dio.web.lab02.debuggin_exemplo;

import java.util.Scanner;

public class CalculadoraDeMedias {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
		
		double media = calculaMediaDaTurma(alunos, scan);
		
		//System.out.printf("Média da turna %f", media); 	//Saída: Média da turna 6,500000
		//System.out.printf("Média da turna %.2f", media); 	//Saída: Média da turna 6,50
		System.out.printf("Média da turna %.1f", media); 	//Saída: Média da turna 6,5
		
	}
	
	static double calculaMediaDaTurma(String[] alunos, Scanner scan) {
		double soma = 0;
		for(String aluno: alunos) {
			System.out.printf("Nota do aluno %s: ", aluno);
			double nota = scan.nextDouble();
			soma += nota;
		}
		System.out.println(soma);
		System.out.println(soma / Double.valueOf(alunos.length));
		return soma / Double.valueOf(alunos.length);
	}

}