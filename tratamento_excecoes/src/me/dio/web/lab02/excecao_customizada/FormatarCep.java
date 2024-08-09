package me.dio.web.lab02.excecao_customizada;

public class FormatarCep {

	public static void main(String[] args) {
		try {
			System.out.println(formatarCep("0000000"));
		} catch (CepInvalidoException e) {
			System.out.println("O CEP não corresponde com as regras de negocio!");
		}
	}
	
	static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        //Simulando um cep formatado
        return "CEP Formatado: 23.765-064";
    }

}