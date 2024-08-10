package me.dio.web.financeira;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import me.dio.web.consumidor.Cliente;

@Getter
@Setter
public abstract class Conta implements Operacoes {
	
	private static final String AGENCIA_PADRAO = "12";
	private static int sequencial = 1;
	
	protected String agencia;
	
	protected String conta;
	
	protected double saldo;
	
	protected double chequeEspecial;
	
	private Cliente cliente;
	
	private Emprestimo emprestimo;
	
	private List<Transacao> transacoes;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.conta = String.valueOf(sequencial++);
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) throws ContaException {
		if(valor <= (saldo + chequeEspecial)) {
			this.saldo -= valor;
		} else {
			throw new ContaException("Saldo insuficiente para completar a transação");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) throws ContaException {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void emprestimo(Emprestimo emprestimo) {
		this.depositar(emprestimo.getValorEmprestimo());
		this.emprestimo = emprestimo;
	}
	
	protected void imprimirDadosConta() {
		System.out.println("Titular: "+ this.cliente.getNome());
		System.out.println("Agência: "+ this.agencia);
		System.out.println("Conta: "+ this.conta);
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
		if(this.getEmprestimo() != null) {
			System.out.println(String.format("Emprestimo:\n\t R$ %.2f", this.emprestimo.getValorEmprestimo()) + " Vencimento: " + this.emprestimo.getDataVencimento().plusMonths(1));
		}
	}
	
}
