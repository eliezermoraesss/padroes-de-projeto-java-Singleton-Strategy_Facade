package moraes.eliezer;

import moraes.eliezer.facade.Facade;
import moraes.eliezer.singleton.SingletonEager;
import moraes.eliezer.singleton.SingletonLazy;
import moraes.eliezer.singleton.SingletonLazyHolder;
import moraes.eliezer.strategy.Comportamento;
import moraes.eliezer.strategy.ComportamentoAgressivo;
import moraes.eliezer.strategy.ComportamentoDefensivo;
import moraes.eliezer.strategy.ComportamentoNormal;
import moraes.eliezer.strategy.Robo;

public class Test {
	
	public static void main(String[] args) {
		
		// Singleton 
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);	
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);		
		robo.mover();
		
		robo.setComportamento(agressivo);		
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Eliezer", "13800207");
		
	}

}
