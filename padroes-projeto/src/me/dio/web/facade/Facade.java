package me.dio.web.facade;

import me.dio.web.facade.subsistema_externo1.CrmService;
import me.dio.web.facade.subsistema_externo2.BuscaCepService;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = BuscaCepService.getInstancia().recuperarCidade(cep);
		String estado = BuscaCepService.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
	
}
