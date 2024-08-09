package me.dio.web.desafio.smartphone;

import me.dio.web.desafio.smartphone.internet.Safari;
import me.dio.web.desafio.smartphone.reprodutor.Ipod;
import me.dio.web.desafio.smartphone.telefonia.Phone;

public class IphoneOS implements Ipod, Phone, Safari {

    // Implementação da interface Ipod (Music Player)
    @Override
    public void tocarMusica(String nomeMusica) {
        System.out.println("Tocando música: " + nomeMusica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void parar() {
        System.out.println("Música stopped");
    }

    @Override
    public void passarMusica() {
        System.out.println("Próxima música");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltar música");
    }
    
    // Implementação da interface Phone
    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para: " + numeroTelefone);
    }

    @Override
    public void receberLigacao(String numeroTelefone) {
        System.out.println("Recebendo ligação de: " + numeroTelefone);
    }

    @Override
    public void enviarSMS(String numeroTelefone, String mensagem) {
        System.out.println("Enviando mensagem para: " + numeroTelefone + ": " + mensagem);
    }

    @Override
    public void receberSMS(String numeroTelefone, String mensagem) {
        System.out.println("Recebendo mensagem de: " + numeroTelefone + ": " + mensagem);
    }
    
    // Implementação da interface Safari (Browser)
    @Override
    public void navegarUrl(String url) {
        System.out.println("Navegando para a URL: " + url);
    }

    @Override
    public void atualizarPagF5() {
        System.out.println("Página atualizada");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando para página anterior");
    }

    @Override
    public void avancar() {
        System.out.println("Avançando página");
    }
	
}
