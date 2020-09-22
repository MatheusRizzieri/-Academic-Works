package Padrão;

public class Demo {

	public static void main(String[] args) {
		Singleton singleton = null;
		
		for(int i = 0 ; i < 100000 ; i++) {
			singleton = Singleton.getInstancia();
		}
	

	}

}
