package me.dio.web.lab01.pilha_execucao;

public class ExemploDebuggin {

	public static void main(String[] args) {
		System.out.println("Iniciou o programa no método main.");
		a();
		System.out.println("Finalizou o programa no método main.");
	}
	
	static void a() {
		System.out.println("Entrou no método a.");
		b();
		System.out.println("Finalizou o método a.");
	}
	
	static void b() {
		System.out.println("Entrou no método b.");
		c();
		System.out.println("Finalizou o método b.");
	}
	
	static void c() {
		System.out.println("Entrou no método c.");
//		Thread.dumpStack();
		System.out.println("Finalizou o método c.");
	}

}