package me.dio.web.financeira;

public interface Operacoes {
	
	void sacar(double valor) throws ContaException;
	void depositar(double valor);
	void transferir(double valor, Conta contaDestino) throws ContaException;
	void imprimirExtrato();	
	void emprestimo(Emprestimo emprestimo);
}
