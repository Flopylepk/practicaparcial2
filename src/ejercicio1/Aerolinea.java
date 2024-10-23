package ejercicio1;

public class Aerolinea {
	private String nombre;

	public Aerolinea(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + "]";
	}
	
	
}
