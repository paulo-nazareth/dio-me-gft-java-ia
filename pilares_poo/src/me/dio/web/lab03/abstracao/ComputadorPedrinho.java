package me.dio.web.lab03.abstracao;

public class ComputadorPedrinho {
	public static void main(String[] args) {

		//Encapsulamento
		MSNMessenger msn = new MSNMessenger();
//		msn.validarConectadoInternet();
		msn.enviarMensagem();
		msn.receberMensagem();
//		msn.salvarHistoricoMensagem();

		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();

		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();

	}
}