package ejercicio1;

import java.util.Arrays;

public class Asientos {
	private String[][] asientos= {
			{"disp","disp","ocup","disp"},
			{"disp","ocup","disp","disp"},
			{"ocup","disp","disp","disp"},
			{"disp","disp","disp","ocup"},
	};

	public Asientos(String[][] asientos) {
		this.asientos = asientos;
	}
	public Asientos() {

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
