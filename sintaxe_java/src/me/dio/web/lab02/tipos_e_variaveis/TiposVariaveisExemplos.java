package me.dio.web.lab02.tipos_e_variaveis;

public class TiposVariaveisExemplos {

	int idade;
	int anoFabricacao = 2021;
	double salarioMinimo = 2.500; //2,5
	
	private void tipoDados() {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; 	 //Caso começe com zero, recomendável trocar o tipo, pois será suprimido ou desprezado;
		long cpf = 98765432109L; //Caso começe com zero, recomendável trocar o tipo, pois será suprimido ou desprezado;
		float pi = 3.14F;
		double salario = 1275.33;
	}
	
	//Atribuição de valores de Tipos diferentes, conforme comportado
	short numeroCurto = 1;
	int numeroNormal = numeroCurto;
	//short numeroCurto2 = numeroNormal; //Não Comporta

	
	//Para de clarar uma constante utiliza-se a palavra final, e por convenção, o nome desta variável deverá ser escrita em caixa alta.
	final double VALOR_PI = 3.14;
	
}
