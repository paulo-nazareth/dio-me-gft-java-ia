package me.dio.web.desafio.aparelho;

import me.dio.web.desafio.smartphone.IphoneOS;

public class Iphone {

	public static void main(String[] args) {
		IphoneOS iPhone = new IphoneOS();

	    // Testando o Reprodutor Musical
		iPhone.tocarMusica("CASCA DE BALA - Thullio Milionário");
		iPhone.pausar();
		iPhone.passarMusica();
		iPhone.parar();

	    // Testando o Aparelho Telefônico
		iPhone.ligar("(61) 99999-9999");
		iPhone.receberLigacao("(61) 99999-9999");
		iPhone.enviarSMS("(61) 99999-9999", "Mensagem Enviada com Sucesso!");
		iPhone.receberSMS("(61) 99299-9999", "Mensagem Recebida");

	    // Testando o Navegador na Internet
		iPhone.navegarUrl("https://www.dio.me");
		iPhone.atualizarPagF5();
		iPhone.voltar();
		iPhone.avancar();
	}
}
