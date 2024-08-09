package me.dio.web.lab04.interfaces;

import me.dio.web.lab04.interfaces.equipamentos.copiadora.Copiadora;
import me.dio.web.lab04.interfaces.equipamentos.digitalizar.Digitalizadora;
import me.dio.web.lab04.interfaces.equipamentos.impressora.Impressora;
import me.dio.web.lab04.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
//		Impressora impressora = new Deskjet();
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;

		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}