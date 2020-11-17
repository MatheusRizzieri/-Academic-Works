package Main;

import strategy.Contexto;

public class StrategyDemo {

	public static void main(String[] args) {
		
		Contexto context = new Contexto(new Soma());
		System.out.println("Chamando Soma: " + context.executaStrategy(10, 20));
		
		System.out.println();
		
		context = new Contexto (new Subtracao());
		System.out.println("Chamando Subtracao: " + context.executaStrategy(10, 5));
		
		System.out.println();
		
		context = new Contexto (new Divisao());
		System.out.println("Chamando Divisao: " + context.executaStrategy(30, 2));
		
		System.out.println();
		
		

	}

}