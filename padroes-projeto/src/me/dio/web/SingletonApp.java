package me.dio.web;

public class SingletonApp {

	public static void main(String[] args) {
		
		/* Testes Design Pattern - Singleton */
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		
		SingletonEager eager = SingletonEager.getInstancia();
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		
		
	}
}
