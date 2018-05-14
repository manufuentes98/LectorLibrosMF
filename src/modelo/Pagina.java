package modelo;

public class Pagina {

	private long primero;
	private long ultimo;

	public Pagina(long primero, long ultimo) {
		super();
		this.primero = primero;
		this.ultimo = ultimo;
	}

	public long getPrimer() {
		return primero;
	}

	public long getUltimo() {
		return ultimo;
	}

	public void setPrimer(long primer) {
		this.primero = primer;
	}

	public void setUltimo(long ultimo) {
		this.ultimo = ultimo;
	}

}
