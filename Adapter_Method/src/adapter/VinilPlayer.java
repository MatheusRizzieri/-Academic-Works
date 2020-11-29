package adapter;

public class VinilPlayer implements TocadorAvancado {

	@Override
	public void tocarVinil(String nomeDisco) {
		System.out.println("Tocando o Vinil:" + nomeDisco);

	}

	@Override
	public void tocarCd(String nomeDisco) {
		// Nada a ser feito

	}
}
