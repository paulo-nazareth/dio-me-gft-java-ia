package me.dio.web.lab01.encapsulamento;

import me.dio.web.lab02.heranca.Veiculo;

public class Autodromo {

	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("9898989");
		jeep.ligar();

		Moto suziki = new Moto();
		suziki.setChassi("789899");
		suziki.ligar();

		//Exemplo de Abstração e Polimorfismo
		Veiculo generico = jeep;
		generico.ligar();
	}
	
}
