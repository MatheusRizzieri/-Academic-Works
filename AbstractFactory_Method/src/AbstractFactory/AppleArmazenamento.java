package AbstractFactory;


	public class AppleArmazenamento implements armazenamento {

	    private int tamanhoArmazen;

	    public AppleArmazenamento(int tamanhoArmazen) {
	        this.tamanhoArmazen = tamanhoArmazen;
	        System.out.println(tamanhoArmazen + "GB SSD em uso");
	    }

	    public void getType() {
	        System.out.println("SSD");
	    }

	    @Override
	    public String toString() {
	        return tamanhoArmazen + "GB Solid State Drive";
	    }
	}

