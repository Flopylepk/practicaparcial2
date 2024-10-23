package ejercicio1;

import java.util.Arrays;

public class Asientos {
	private String[][] asientos;

	public Asientos(String[][] asientos) {
		this.asientos = asientos;
	}

	public String[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(String[][] asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		return "Asientos [asientos=" + Arrays.toString(asientos) + "]";
	}
	
}
