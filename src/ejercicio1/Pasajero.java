package ejercicio1;

import javax.swing.JOptionPane;

public class Pasajero extends Usuarios{
private Vuelo vuelo;

public Pasajero(String nombre, int edad, String id, Vuelo vuelo) {
	super(nombre, edad, id);
	this.vuelo = vuelo;
}

public Vuelo getVuelo() {
	return vuelo;
}

public void setVuelo(Vuelo vuelo) {
	this.vuelo = vuelo;
}

@Override
public String toString() {
	return "Pasajero [vuelo=" + vuelo + ", toString()=" + super.toString() + "]";
}


@Override
public void Registrarse() {
	// TODO Auto-generated method stub
	super.Registrarse();
}

//Validaciones
public static int validarNumeros(String mensaje) {
	boolean flag ;
	String num ="" ;
	do {
		flag =true;
		num = JOptionPane.showInputDialog(mensaje);
		while (num.isEmpty()) {
			num = JOptionPane.showInputDialog(mensaje);
		}
		for (int i = 0; i < num.length(); i++) {
			if (!Character.isDigit(num.charAt(i))) {
				flag = false;
				break;
			}
		}
	} while (!flag);

	return Integer.parseInt(num);
}
public String validarCaracteres(String mensaeje) {
	String palabra = "";
	while (palabra.equals("")) {
		palabra = JOptionPane.showInputDialog(mensaeje);
	}
	return palabra;
}
}
