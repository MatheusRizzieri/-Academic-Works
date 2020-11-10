package Principal;
import Memento.CareTaker;
import Memento.Originator;
public class DemoMemento {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setEstado("Estado 1");
		careTaker.add(originator.salvarEstadoMemento());
		
		originator.setEstado("Estado 2");
		careTaker.add(originator.salvarEstadoMemento());
		
		originator.setEstado("Estado Atual");
		System.out.println("Estado Atual:" + originator.getEstado());
		
		originator.getEstadoSalvoMemento(careTaker.get(0));
		System.out.println("Primeiro Estado Salvo:" + originator.getEstado());
		originator.getEstadoSalvoMemento(careTaker.get(1));
		System.out.println("Segundo Estado Salvo:"+ originator.getEstado());
	

	}

}
