package me.dio.web.facade.subsistema_externo2;

public class BuscaCepService {

	private static class InstanceHolder {
		public static BuscaCepService instancia = new BuscaCepService();
	}
	
	//Garante que nunca seja instanciado externamente
	private BuscaCepService() {
		super();
	}
	
	public static BuscaCepService getInstancia() {
		return InstanceHolder.instancia;
	}
	
	public String recuperarCidade(String cep){
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep){
		return "São Paulo";
	}
	
}
