package AbstractFactory;


	public class DellProcessador implements processador {

	    private String armazenamento;

	    public DellProcessador() {

	        System.out.println("AMD em uso por Dell Laptop");
	    }

	    
	    public void anexarArmazem(armazenamento Armazenamento) {
	        this.armazenamento = Armazenamento.toString();
	        System.out.println(Armazenamento + " anexado ao Dell Laptop");
	    }

	    public void printStatus() {
	        System.out.println(this.toString());

	    }

	    @Override
	    public String toString() {
	        return "DellProcessor foi criado usando AMD Processador e " + this.armazenamento;
	    }

	}
	