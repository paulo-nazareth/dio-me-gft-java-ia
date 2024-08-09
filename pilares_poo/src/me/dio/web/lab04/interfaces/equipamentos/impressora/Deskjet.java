package me.dio.web.lab04.interfaces.equipamentos.impressora;

public class Deskjet implements Impressora {

	@Override
	public void imprimir() {
		System.out.println("Deskjet Imprimindo");
	}

}