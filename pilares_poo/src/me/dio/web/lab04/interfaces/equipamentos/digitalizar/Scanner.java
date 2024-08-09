package me.dio.web.lab04.interfaces.equipamentos.digitalizar;

public class Scanner implements Digitalizadora {

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando");
	}

}