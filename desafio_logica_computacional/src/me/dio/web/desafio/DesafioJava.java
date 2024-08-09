package me.dio.web.desafio;

import java.util.Scanner;

public class DesafioJava {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valorSalario = Double.parseDouble(ler.nextLine().replace("R$", "").replace(",", ".").trim());
		double valorBeneficios = Double.parseDouble(ler.nextLine().replace("R$", "").replace(",", ".").trim());
		double imposto = 0;
		if(valorSalario >= 0.0 && valorSalario <= 1100.00) {
			imposto = 0.05;
		} else if(valorSalario >= 1100.01 && valorSalario <= 2500.00) {
			imposto = 0.10;
		} else if(valorSalario > 2500) {
			imposto = 0.15;
		}
		double salarioFuncionario = valorSalario - (valorSalario * imposto) + valorBeneficios;
		System.out.println(String.format("%.2f", salarioFuncionario));
	}

}
