package me.dio.web.lab03.abstracao;

public class ComputadorPedrinho {
	public static void main(String[] args) {

		//Polimorfismo
		ServicoMensagemInstantanea smi = null;
		String appEscolhido = "msn";

		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		if(appEscolhido.equals("fmb"))
			smi = new FacebookMessenger();
		if(appEscolhido.equals("tlg"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();

	}
}