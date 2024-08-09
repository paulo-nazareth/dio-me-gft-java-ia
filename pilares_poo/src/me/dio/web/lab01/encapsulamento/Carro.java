package me.dio.web.lab01.encapsulamento;

public class Carro {
	
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
