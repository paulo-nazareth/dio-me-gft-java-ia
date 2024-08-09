package me.dio.web.lab03.abstracao;

public class Telegram extends ServicoMensagemInstantanea {
	
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram.");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram.");
	}
}