package AbstractFactory;

public class Teste {

	public static void main(String[] args) {

		processador DellProcessador = criarLaptop(new DellLaptop(1024));
		DellProcessador.printStatus();
		System.out.println("*****************************************");
		processador AppleProcessador = criarLaptop(new AppleLaptop(512));
		AppleProcessador.printStatus();

	}

	public static processador criarLaptop(laptopFactory laptopFactory) {
		processador Processador = laptopFactory.criarProcessador();
		armazenamento Armazenamento = laptopFactory.criarArmazenamento();
		Processador.anexarArmazem(Armazenamento);
		return Processador;

	}

}
