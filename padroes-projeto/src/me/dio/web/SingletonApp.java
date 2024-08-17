package me.dio.web;

import me.dio.web.singleton.SingletonEager;
import me.dio.web.singleton.SingletonLazy;
import me.dio.web.singleton.SingletonLazyHolder;

public class SingletonApp {

	public static void main(String[] args) {
		
		/* Testes Design Pattern - Singleton */
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		
		SingletonEager eager = SingletonEager.getInstancia();
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		
		
	}
}
