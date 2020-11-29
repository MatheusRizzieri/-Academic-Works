package AbstractFactory;


public class DellLaptop implements laptopFactory {
    private int tamanhoArmazen;
    public DellLaptop(int tamanhoArmazen) {
        this.tamanhoArmazen=tamanhoArmazen;
    }
    
    public processador criarProcessador() {
        return new DellProcessador();
    }

    public armazenamento criarArmazenamento() {
        return new DellArmazenamento(tamanhoArmazen);
    }

}