package me.dio.web.lab01.encapsulamento;

import me.dio.web.lab02.heranca.Veiculo;

public class Carro extends Veiculo{
	
	public void ligar() {
		conferirCombustivel();
		conferirCambio();
		System.out.println("Carro Ligado!");
	}

	private void conferirCombustivel() {
		System.out.println("-> Conferindo Combustivel...");
	}

	private void conferirCambio() {
		System.out.println("-> Conferindo Cambio...");
	}
	
}
