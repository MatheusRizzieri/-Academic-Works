package factory;

public class carroFactory extends veiculoFactory {

	@Override
	public veiculo criarVeiculo() {
		return new carro();
	}
}