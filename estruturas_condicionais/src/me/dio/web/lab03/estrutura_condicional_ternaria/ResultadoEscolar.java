package me.dio.web.lab03.estrutura_condicional_ternaria;

public class ResultadoEscolar {

	public static void main(String[] args) {

		int nota = 6;
		String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);

	}

}
