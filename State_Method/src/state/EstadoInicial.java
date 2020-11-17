package state;

public class EstadoInicial implements EstadoIF {
	
	@Override
	public void fazerAcao(Contexto context) {
		System.out.println("O filme esta no estado inicial:");
		
		context.setEstado(this);
	}

}
