package AbstractFactory;

	public class AppleLaptop implements laptopFactory {

	    private int tamanhoArmazen;

	    public AppleLaptop(int tamanhoArmazen) {
	        this.tamanhoArmazen = tamanhoArmazen;
	    }

	    public processador criarProcessador() {
	        return new AppleProcessador();
	    }

	    public armazenamento criarArmazenamento() {
	        return new AppleArmazenamento(tamanhoArmazen);
	    }

	}

