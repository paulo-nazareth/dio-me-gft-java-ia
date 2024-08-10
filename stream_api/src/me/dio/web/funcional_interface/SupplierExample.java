package me.dio.web.funcional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
  public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .toList();

    // Imprimir as saudações geradas (Consumer)
    listaSaudacoes.forEach(s -> System.out.println(s));
    // ou
    // Imprimir as saudações geradas (Reference)
    listaSaudacoes.forEach(System.out::println);
    
    
    // Usar o Supplier para obter uma lista com 5 saudações (Criando o Supplier)
    List<String> listaSaudacoesExemplo1 = Stream.generate(
    	new Supplier<String>() {
			@Override
			public String get() {
				return "Olá, seja bem-vindo(a)!";
			}
		}
    ).limit(5)
     .toList();
    
    // Usar o Supplier para obter uma lista com 5 saudações (Criando o Supplier)
    List<String> listaSaudacoesExemplo2 = Stream.generate(
    		() -> {
    			return "Olá, seja bem-vindo(a)!";
    }).limit(5).toList();
    
    // Usar o Supplier para obter uma lista com 5 saudações (Criando o Supplier)
    List<String> listaSaudacoesExemplo3 = Stream.generate(() -> "Olá, seja bem-vindo(a)!").limit(5).toList();
    
  }
}