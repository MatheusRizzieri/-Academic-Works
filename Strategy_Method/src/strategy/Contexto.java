package strategy;

public class Contexto {
	
	private Calculadora strategy;
	
	public Contexto(Calculadora calculadora) {
		this.strategy = calculadora;
	}
	
	public int executaStrategy(int num1, int num2) {
		return strategy.operacao(num1, num2);
	}

}
