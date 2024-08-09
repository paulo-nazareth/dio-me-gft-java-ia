package me.dio.web.lab04.interfaces.equipamentos.copiadora;

public class Xerox implements Copiadora{

	@Override
	public void copiar() {
		System.out.println("Copiando");
	}

}