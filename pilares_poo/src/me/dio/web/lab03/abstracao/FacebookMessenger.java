package me.dio.web.lab03.abstracao;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
	
}