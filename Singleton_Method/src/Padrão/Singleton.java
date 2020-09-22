package Padrão;

public class Singleton {
	
	private Singleton() {
		
	}
	
	private static Singleton instancia = null;
	
	public static Singleton getInstancia() {
		if (instancia == null) {
			System.out.println("instancia criada!");
			instancia = new Singleton();
		}
		return instancia;
	}

}
