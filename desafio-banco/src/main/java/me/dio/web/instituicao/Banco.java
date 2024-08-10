package me.dio.web.instituicao;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import me.dio.web.financeira.Conta;

@Getter
@Setter
public class Banco {

	private String nome;
	
	private List<Conta> contas;
	
}
