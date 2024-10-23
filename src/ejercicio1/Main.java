package ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vuelo vuelo=new Vuelo("",0);
Aerolinea aerolinea=new Aerolinea("");
Pasajero pasajero=new Pasajero("",0,"",vuelo);
Gerente gerente=new Gerente("",0,"",aerolinea);;
String []menu= {"Gerente", "Pasajero","salir"};
int opcion=0;
do {
	opcion=JOptionPane.showOptionDialog(null, "Elija que quiere ser", null, 0, 0, null, menu, menu[0]);
	switch (opcion) {
	case 0:
		gerente.Registrarse();
		break;
	case 1:
		pasajero.Registrarse();
		break;
	case 2:
		JOptionPane.showMessageDialog(null, "ok nos vemos la proxima");
		break;
	}
} while (opcion!=2);
	}

}
