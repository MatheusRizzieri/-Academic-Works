package AbstractFactory;

	public class AppleProcessador implements processador {

	    private String armazenamento;
	    
	    public AppleProcessador() {
	        System.out.println("Processador Intel será usado para Apple Laptop");
	    }

	    public void anexarArmazem(armazenamento Armazenamento) {
	        this.armazenamento=armazenamento.toString();
	        System.out.println(armazenamento + " é anexado ao Apple Laptop");
	    }

	    public void printStatus() {
	        System.out.println(this.toString());

	    }

	    @Override
	    public String toString() {
	        return "AppleProcessor é criado usando processador Intel e "+this.armazenamento;
	    }

	}
