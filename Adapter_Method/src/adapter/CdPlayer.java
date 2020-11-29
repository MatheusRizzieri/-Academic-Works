package adapter;

public class CdPlayer implements TocadorAvancado {

	@Override
	public void tocarVinil(String nomeDisco) {
		// Nada a ser Feito

	}

	@Override
	public void tocarCd(String nomeDisco) {
		System.out.println("Tocando o CD:" + nomeDisco);
	}

}
