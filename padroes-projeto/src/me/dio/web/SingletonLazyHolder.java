package me.dio.web;

/**
 * Singleton "Apressado" 
 * 
 * "*/
public class SingletonLazyHolder {
	
	private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	
	//Garante que nunca seja instanciado externamente
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return instancia;
	}

}
