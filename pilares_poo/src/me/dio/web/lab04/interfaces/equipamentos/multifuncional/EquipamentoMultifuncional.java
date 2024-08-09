package me.dio.web.lab04.interfaces.equipamentos.multifuncional;

import me.dio.web.lab04.interfaces.equipamentos.copiadora.Copiadora;
import me.dio.web.lab04.interfaces.equipamentos.digitalizar.Digitalizadora;
import me.dio.web.lab04.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void copiar() {
		System.out.println("Copiando via Multifuncional...");
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via Multifuncional...");
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo via Multifuncional...");
	}

}