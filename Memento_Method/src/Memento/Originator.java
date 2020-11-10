package Memento;

public class Originator {

	private String estado;

	public void setEstado(String estadoAsalvar) {
		this.estado = estadoAsalvar;
	}

	public String getEstado() {
		return this.estado;
	}

	public Memento salvarEstadoMemento() {
		return new Memento(estado);

	}

	public void getEstadoSalvoMemento(Memento ultimoEstado) {
		estado = ultimoEstado.getEstado();
	}

}
