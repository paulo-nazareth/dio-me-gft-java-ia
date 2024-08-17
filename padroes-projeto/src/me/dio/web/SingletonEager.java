package me.dio.web;

/**
 * Singleton "Lazy Holder"
 *  @see <a href="https://stackoverflow.com/a/24018148">ReferÍncia</a>
 * 
 * "*/
public class SingletonEager {
	
	private static class InstanceHolder {
		public static SingletonEager instancia = new SingletonEager();
	}
	
	//Garante que nunca seja instanciado externamente
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return InstanceHolder.instancia;
	}

}
