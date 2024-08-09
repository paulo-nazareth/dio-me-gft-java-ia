package me.dio.web.lab01.estruturas_condicionais_simples;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		
		double saldo = 25.0;
		double valorSolicitado = 26.0;
		
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Novo saldo: " + saldo);
		} else { //Melhoria implementada com base no entendimento das condicionais compostas
			System.out.println("Saldo insuficiente!");
		}
	}
}
