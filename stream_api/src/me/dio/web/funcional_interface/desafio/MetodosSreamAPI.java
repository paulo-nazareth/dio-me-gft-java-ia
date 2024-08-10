package me.dio.web.funcional_interface.desafio;

import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class MetodosSreamAPI {
	
	/**
		Desafio 1 - Mostre a lista na ordem numérica:
		Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
	*/
	public void ordemCrescente(List<Integer> numeros) {
		System.out.println("-------------------Resultado Desafio 1-------------------");
		Set<Integer> ordenado = new TreeSet<Integer>(numeros);
		System.out.println(ordenado);
	}
	/**
		Desafio 2 - Imprima a soma dos números pares da lista:
		Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
	*/
	public void somaNumeroPares(List<Integer> numeros) {
		System.out.println("-------------------Resultado Desafio 2-------------------");
		int resultado = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
		System.out.println(resultado);
	}
	/**
		Desafio 3 - Verifique se todos os números da lista são positivos:
		Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
	*/
	public void verificarNumerosPositivos(List<Integer> numeros) {
		System.out.println("-------------------Resultado Desafio 3-------------------");
		numeros.stream()
		.filter(t -> t >= 0)
		.forEach(System.out::println);
	}
	/**
		Desafio 4 - Remova todos os valores ímpares:
		Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
	*/
	public void removerNumerosPares(List<Integer> numeros) {
		System.out.println("-------------------Resultado Desafio 4-------------------");
		List<Integer> numeroImpares = numeros.stream().filter(n -> n % 2 != 0).toList();
		System.out.println(numeroImpares);
	}
	/**
		Desafio 5 - Calcule a média dos números maiores que 5:
		Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
	*/
	public void mediaNumerosMaioresQue5(List<Integer> numeros) {
		System.out.println("-------------------Resultado Desafio 5-------------------");
		List<Integer> numeroMaioresQue5 = numeros.stream().filter(n -> n > 5).toList();
		int resultado = numeroMaioresQue5.stream().reduce(0, Integer::sum);
		System.out.println(resultado / numeroMaioresQue5.size());
	}
	/**
		Desafio 6 - Verificar se a lista contém algum número maior que 10:
		Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
	*/
	public void numerosMaioresQue10(List<Integer> numeros) {
		System.out.println("-------------------Resultado Desafio 6-------------------");
		List<Integer> numerosMaioresQue10 = numeros.stream().filter(n -> n > 10).toList();
		System.out.println(numerosMaioresQue10.isEmpty() ? "Nenhum número maior que 10 na lista." : numerosMaioresQue10);
	}
	/**
		Desafio 7 - Encontrar o segundo número maior da lista:
		Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
	*/
	public void segundoMaior(List<Integer> numeros) {
		System.out.println("-------------------Resultado Desafio 7-------------------");
		Set<Integer> ordenado = new TreeSet<Integer>(numeros);
		Optional<Integer> retorno1 = ordenado.stream().max(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});
		ordenado.remove(retorno1.get());
		Optional<Integer> retorno = ordenado.stream().max(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});
		System.out.println(retorno);
	}
	/**
		Desafio 8 - Somar os dígitos de todos os números da lista:
		Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
	*/
	public void somarTudo(List<Integer> numeros) {
		System.out.println("-------------------Resultado Desafio 8-------------------");
		System.out.println(numeros.stream().reduce(0, Integer::sum));
	}
	/**
		Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
		Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
	*/
	/**
		Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
		Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
	*/
	/**
		Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
		Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
	*/
	/**
		Desafio 12 - Encontre o produto de todos os números da lista:
		Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
	*/
	/**
		Desafio 13 - Filtrar os números que estão dentro de um intervalo:
		Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
	*/
	/**
		Desafio 14 - Encontre o maior número primo da lista:
		Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
	*/
	/**
		Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
		Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
	*/
	/**
		Desafio 16 - Agrupe os números em pares e ímpares:
		Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
	*/
	/**
		Desafio 17 - Filtrar os números primos da lista:
		Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
	*/
	/**
		Desafio 18 - Verifique se todos os números da lista são iguais:
		Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
	*/
	/**
		Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
		Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
	*/
}
