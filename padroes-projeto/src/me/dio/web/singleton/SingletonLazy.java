package me.dio.web.singleton;

/**
 * Singleton "Preguiçoso"
 * 
 * "*/
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	//Garante que nunca seja instanciado externamente
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		
		if(instancia == null)
			instancia = new SingletonLazy();
		
		return instancia;
	}

}
