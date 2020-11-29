package factory;

public class bikeFactory extends veiculoFactory {

	@Override
	public veiculo criarVeiculo() {
		return new bike();
	}

}