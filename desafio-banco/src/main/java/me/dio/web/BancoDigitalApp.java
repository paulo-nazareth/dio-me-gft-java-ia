package me.dio.web;

import java.time.LocalDate;

import me.dio.web.consumidor.Cliente;
import me.dio.web.financeira.Conta;
import me.dio.web.financeira.ContaCorrente;
import me.dio.web.financeira.ContaException;
import me.dio.web.financeira.ContaPoupanca;
import me.dio.web.financeira.Emprestimo;

public class BancoDigitalApp {

	public static void main(String[] args) throws ContaException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo H.");
		
		Conta contaCorrente = new ContaCorrente(cliente);
		Conta contaPoupanca = new ContaPoupanca(cliente);
		
		contaCorrente.depositar(100);
		contaCorrente.transferir(70, contaPoupanca);
		Emprestimo emprestimo = new Emprestimo(900, 12, LocalDate.of(2024, 8, 01));
		contaCorrente.emprestimo(emprestimo);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
				
	}
}
