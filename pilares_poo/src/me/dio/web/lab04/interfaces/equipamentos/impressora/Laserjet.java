package me.dio.web.lab04.interfaces.equipamentos.impressora;

public class Laserjet implements Impressora {

	@Override
	public void imprimir() {
		System.out.println("Laserjet Imprimindo");
	}

}