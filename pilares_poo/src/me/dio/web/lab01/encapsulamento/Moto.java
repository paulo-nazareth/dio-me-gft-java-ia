package me.dio.web.lab01.encapsulamento;

import me.dio.web.lab02.heranca.Veiculo;

public class Moto extends Veiculo{

	@Override
	public void ligar() {
		System.out.println("Moto Ligada!");
	}
}