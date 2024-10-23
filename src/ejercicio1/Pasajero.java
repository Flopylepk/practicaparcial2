package ejercicio1;

import javax.swing.JOptionPane;

public class Pasajero extends Usuarios{
private Vuelo vuelo;
private String asiento;

public Pasajero(String nombre, int edad, String id, Vuelo vuelo) {
	super(nombre, edad, id);
	this.vuelo = vuelo;
	this.asiento="no asignado";
}

public Vuelo getVuelo() {
	return vuelo;
}

public void setVuelo(Vuelo vuelo) {
	this.vuelo = vuelo;
}

public String getAsiento() {
	return asiento;
}

public void setAsiento(String asiento) {
	this.asiento = asiento;
}




@Override
public String toString() {
	return "Pasajero [vuelo=" + vuelo + ", asiento=" + asiento + ", toString()=" + super.toString() + "]";
}

@Override
public void Registrarse() {
	Aerolinea aerolinea=new Aerolinea("AerolineasArgentinas");
	Asientos asientos=new Asientos();
	Vuelo vuelo=new Vuelo("Pepe", 12,asientos,aerolinea);
	super.Registrarse();
	this.vuelo=vuelo;
	String asientos2="Asientos\n";
	String []menu= {"reservar asiento", "ver vuelo", "ver asiento","ver mis datos", "salir"};
	int opcion=0;
	do {
		opcion=JOptionPane.showOptionDialog(null, "menu del pasajero", null, 0, 0, null, menu, menu[0]);
		switch (opcion) {
		case 0:
			if (asiento=="no asignado") {
				for (int i = 0; i < asientos.getAsientos().length; i++) {
					asientos2 = asientos2 + "--------Fila" +(i+1) +"--------\n" ;
					for (int j = 0; j < asientos.getAsientos()[i].length; j++) {
						asientos2 = asientos2 + " Asiento " +(j+1) +asientos.getAsientos()[i][j] ;
					}
					asientos2 = asientos2 + "\n";
				};
				int fila = validarNumeros("Ingrese fila\n" + asientos);
				
				int column = JOptionPane.showOptionDialog(null, "Elija el asiento", "", 0, 0, null, asientos.getAsientos()[fila], asientos.getAsientos()[fila][0]);
				
				if ( asientos.getAsientos()[fila][column].equals("disp")) {
					
					asientos.getAsientos()[fila][column] = "ocup";
					this.asiento = " Fila " + fila + " asiento " + column ; 
					JOptionPane.showMessageDialog(null, "Ya tenes tu asiento!");
					
				}else {
					JOptionPane.showMessageDialog(null, "No podes seleccionar asietno");

				}
			}else {
				JOptionPane.showMessageDialog(null, "usted ya tiene un asiento asignado");
			}
			break;
		case 1:
			JOptionPane.showMessageDialog(null, vuelo);
			break;
		case 2:
			if (this.asiento!="no asignado") {
				JOptionPane.showMessageDialog(null, "usted primero tiene que reservar un asiento");
			}else {
				JOptionPane.showMessageDialog(null, this.asiento);
			}
				break;
		case 3:
	JOptionPane.showMessageDialog(null,"Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"id: "+id+"\n"+"Vuelo: "+this.vuelo+"\n"+"Asiento: "+asiento );
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "ok, nos vemos otro dia");
			break;

		}
	} while (opcion!=4);
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
