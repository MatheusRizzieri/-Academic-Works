package factory;

public class teste {
	
	public static void main(String args[]) {
		veiculoFactory bikeFactory = new bikeFactory();
		veiculoFactory carroFactory = new carroFactory();

		veiculo bike = bikeFactory.assembleVeiculo();
		veiculo carro = carroFactory.assembleVeiculo();

		if (bike instanceof bike) {
			System.out.println("Bike objeto recuperado");
		}

		if (carro instanceof carro) {
			System.out.println("Carro objeto recuperado");
		}
	}

}