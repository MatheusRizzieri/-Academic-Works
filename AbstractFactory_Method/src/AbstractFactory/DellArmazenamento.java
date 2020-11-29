package AbstractFactory;


public class DellArmazenamento implements armazenamento {

    private int tamanhoArmazen;

    public DellArmazenamento(int tamanhoArmazen) {
        this.tamanhoArmazen = tamanhoArmazen;
        System.out.println(tamanhoArmazen + "GB HDD em uso");
    }

    public void getType() {
        System.out.println("HDD");

    }

    @Override
    public String toString() {
        return tamanhoArmazen + "GB Disco ";
    }

}