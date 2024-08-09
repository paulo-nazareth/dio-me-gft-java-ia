package me.dio.web.anatomia_classes;

public class AnatomiaExemplos {
	public static void main(String[] args) {
	metodoSemIdentacao();
		metodoIdentado();
	}
	
	/* Exemplo de sem Identação */
	public static void metodoSemIdentacao() {
	int mediaFinal = 6;
	if(mediaFinal<6)
	System.out.println("REPROVADO");
	else if(mediaFinal==6)
	System.out.println("PROVA MINERVA");
	else
	System.out.println("APROVADO");
	}
	
	/* Exemplo Identado (Facilitando a leitura do Código pelo Desenvolvedor) */
	public static void metodoIdentado() {
		int mediaFinal = 6;
		if(mediaFinal<6)
			System.out.println("REPROVADO");
		else if(mediaFinal==6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}
