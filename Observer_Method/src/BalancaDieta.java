
public class BalancaDieta implements Observer {
       @Override
       public void update(double novoPeso) {
        if (peso >= 100) {
            System.out.println("Voc� ultrapassou o peso limite no sistema!");
        }
       }
}


