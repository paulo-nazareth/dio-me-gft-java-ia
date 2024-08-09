package me.dio.web.lab03.abstracao;

public class Telegram extends ServicoMensagemInstantanea {
	
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	
}