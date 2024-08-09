package me.dio.web.lab01.anatomia_classes;

public class AnatomiaDeclaracoes {

	public static void main(String[] args) {
	/*Declaração de Variáveis
		 * Composição
		 * 1º - Tipo da Variável
		 * 2º - Nome da Variável
		 * 3º - Valor (Opcional)
	* */
		String meuNome = "Paulo";
		int anoFabricacao = 2023;
		int anoNascimento; //Valor não declarado
		boolean verdadeira = true;

	/*Declaração de Métodos
		 * Composição
		 * 1º - Tipo do Retorno (Não precisa ser do mesmo tipo dos parâmetros
		 * 2º - Nome do Método
		 * 3º - Parametro(s) Opcional(is)
		 * TipoRetorno NomeObjetivoNoInfinitivo (Parametros)
	* */
//	Exemplos
		//int somar (int numeroUm, int numero2)
		//String formatarCep (long cep)
		
		String primeiroNome = "Paulo";
		String segundoNome = "Henrique";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); 
		System.out.println(nomeCompleto);
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do Método nomeCompleto: " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
