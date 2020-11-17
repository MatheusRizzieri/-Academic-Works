package state;

public class EstadoPausado implements EstadoIF {

	@Override
	public void fazerAcao(Contexto context) {
		System.out.println("O filme esta pausado:");

		context.setEstado(this);

	}
}
