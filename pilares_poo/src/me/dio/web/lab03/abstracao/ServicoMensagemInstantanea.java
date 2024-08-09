package me.dio.web.lab03.abstracao;

public abstract class ServicoMensagemInstantanea {
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}

	public abstract void enviarMensagem();
//	public void enviarMensagem() {
//		validarConectadoInternet();
//		System.out.println("Enviando mensagem");
//		salvarHistoricoMensagem();
//	}

	public abstract void receberMensagem();
//	public void receberMensagem() {
//		System.out.println("Recebendo mensagem");
//	}
	
}