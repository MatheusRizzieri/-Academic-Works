#Template Method
Markdown

###Definição
O Padrão Template Method define o esqueleto de um algoritmo dentro de um método, transferindo alguns de seus passos para as subclasses. O Template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do próprio algoritmo

###Propósito
Definir um "esqueleto" de um algoritmo sob a forma de um método, deixando que alguns passos sejam implementados por sub-classes.
As sub-classes podem redefinir certos passos de um algoritmo sem modificar a sus estrutura geral.

###Aplicabilidade
O Padão Template Method pode ser utilizado em API's do Java, como na API Swing onde a classe JFrame define o método paint() como abstrato para ser implementado nas subclasses que estendem JFrame.
Além da facilidade de alteração do algoritmo principal, permite reutilizar o código sem perder o controle dos algoritmos.

## Exemplo Aplicável 

public abstract class Treinos {

	final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}

	abstract void preparoFisico();
	abstract void jogoTreino();

	final void treinoTatico() {
		System.out.println("Treino Tatico");
	}

}

class TreinoNoMeioDaTemporada extends Treinos {

	void preparoFisico() {
		System.out.println("Preparo Fisico Intenso.");
	}

	void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Reserva.");
	}
}

class TreinoNoInicioDaTemporada extends Treinos {

	void preparoFisico() {
		System.out.println("Preparo Fisico Leve.");
	}

	void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Junior.");
	}

}

## Consequencia
Template Method usa herança para variar partes de um algoritmo.
Um padrão importante para o desenvolvimento de frameworks, pois fornece uma maneira de separar o comportamento variável do comportamento invariável em uma aplicação.

##Código de explemplo:
-Academic-Works/Template_Method/src/
