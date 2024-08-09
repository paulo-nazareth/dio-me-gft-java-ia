package me.dio.web.desafio;

import java.util.Scanner;

public class DesafioOtimizado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salarioFuncionario = 0;
		double valorSalario = lerValorDescritivo("Salário Bruto", ler);
		double valorBeneficios = lerValorDescritivo("Valor dos Beneficios", ler);
		salarioFuncionario = valorSalario - calcularImposto(valorSalario) + valorBeneficios;
		System.out.println(String.format("%.2f", salarioFuncionario));
	}
	
	public static double calcularImposto(double salario) {
		double percentual = 0;
		if(salario >= 0.0 && salario <= 1100.00) {
			percentual = 0.05;
		} else if(salario >= 1100.01 && salario <= 2500.00) {
			percentual = 0.10;
		} else if(salario > 2500) {
			percentual = 0.15;
		}
		return salario * percentual;
	}
	
	public static double lerValorDescritivo(String descricao, Scanner ler) {
		double valorInformado = 0;
		System.out.println("Informe o ".concat(descricao.concat(" (Moeda Brasileira R$, Moeda Americana Exemplos : R$ 2000,00 ou 2000.00)")));
		try {
			valorInformado = Double.parseDouble(ler.nextLine().replace("R$", "").replace(",", ".").trim());
		} catch (Exception e) {
			System.err.println("O valor informado ("+descricao+") contém caracteres inválidos e possivelmente não está no padrão esperado, favor verifique!");
		}
		return valorInformado;
	} 

}