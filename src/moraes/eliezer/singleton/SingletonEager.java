package moraes.eliezer.singleton;

/**
 * Singleton "apressado".
 * @author eliezermoraesss
 *
 */

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
