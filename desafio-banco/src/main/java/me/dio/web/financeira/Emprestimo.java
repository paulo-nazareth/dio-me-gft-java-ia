package me.dio.web.financeira;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Emprestimo {
	
	private double valorEmprestimo;
	
	private int numeroParcelas;
	
	private LocalDate dataVencimento;

}
