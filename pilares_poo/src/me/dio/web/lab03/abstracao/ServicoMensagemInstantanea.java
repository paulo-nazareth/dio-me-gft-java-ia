package me.dio.web.lab03.abstracao;

public abstract class ServicoMensagemInstantanea {
	
	public void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

	public void salvarHistoricoMensagem() {
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