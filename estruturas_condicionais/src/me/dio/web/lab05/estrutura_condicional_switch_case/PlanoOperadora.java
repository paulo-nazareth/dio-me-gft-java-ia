package me.dio.web.lab05.estrutura_condicional_switch_case;

public class PlanoOperadora {

	public static void main(String[] args) {

		String plano = "M"; //B | M ou T
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}
		else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Instagram grátis");
		}
		else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Instagram grátis");
			System.out.println("5Gb Youtube");
		}
		
		//Exemplo de melhor empregabilidade em relação ao IF...
		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
		
	}
	
}
