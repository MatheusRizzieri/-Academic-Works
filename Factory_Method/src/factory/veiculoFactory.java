package factory;

public abstract class veiculoFactory {

	veiculo Veiculo;
	public veiculo assembleVeiculo() {
		System.out.println("Iniciar Criação");
		Veiculo = criarVeiculo();
		System.out.println("Montando Partes");
		return Veiculo;
	}
	protected abstract veiculo criarVeiculo();
	
	
	
	
	
	
}