package me.dio.web.lab01.encapsulamento;

public class Autodromo {

	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.ligar();
		jeep.setChassi("9898989");

		Moto suziki = new Moto();
		suziki.setChassi("789899");
	}
	
}
