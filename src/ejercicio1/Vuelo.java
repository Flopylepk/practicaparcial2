package ejercicio1;

public class Vuelo {
	private String avion;
	private int numero;
	private Asientos asientos;
	private Aerolinea aerolinea;
	public Vuelo(String avion, int numero, Aerolinea aerolinea) {
		super();
		this.avion = avion;
		this.numero = numero;
		this.aerolinea = aerolinea;
	}
	public Vuelo(String avion, int numero) {
		super();
		this.avion = avion;
		this.numero = numero;
	}
	public String getAvion() {
		return avion;
	}
	public void setAvion(String avion) {
		this.avion = avion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Asientos getAsientos() {
		return asientos;
	}
	public void setAsientos(Asientos asientos) {
		this.asientos = asientos;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	@Override
	public String toString() {
		return "Vuelo [avion=" + avion + ", numero=" + numero + ", asientos=" + asientos + ", aerolinea=" + aerolinea
				+ "]";
	}
	
}
