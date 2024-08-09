package me.dio.web.lab02.estrtutura_for_array;

public class EstruturaForArray {

	public static void main(String[] args) {
		//Em arrays o indice inicia em ZERO
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		for (int x=0; x<alunos.length; x++) {
			System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
		}
		
		//Exemplo Estrutura Foreach
		for(String aluno : alunos) {
			System.out.println("Nome do aluno é : " + aluno);
		}
	}
	
}
