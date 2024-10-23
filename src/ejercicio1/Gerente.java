package ejercicio1;

import javax.swing.JOptionPane;

public class Gerente extends Usuarios{
	private Aerolinea aerolinea;

	public Gerente(String nombre, int edad, String id, Aerolinea aerolinea) {
		super(nombre, edad, id);
		this.aerolinea = aerolinea;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	@Override
	public String toString() {
		return "Gerente [aerolinea=" + aerolinea + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrarse() {
		// TODO Auto-generated method stub
		super.Registrarse();
		Aerolinea aerolinea1=new Aerolinea("AerolineasArgentinas");
		Vuelo vuelo= new Vuelo("",0,aerolinea1);
		this.aerolinea=aerolinea1;
		String [] menu= {"Crear vuelo", "ver Aerolinea", "ver vuelo","ver mis datos", "salir"};
		int opcion=0;
		do {
			opcion=JOptionPane.showOptionDialog(null, "menu de gerente", null, 0, 0, null, menu, menu[0]);
			switch (opcion) {
			case 0:
				
				break;
			case 1:
				JOptionPane.showMessageDialog(null, aerolinea1);
				break;
			case 2:
				if (vuelo.getAvion()=="") {
					JOptionPane.showMessageDialog(null, "usted primero tiene que crear un vuelo");
				}else {
					JOptionPane.showMessageDialog(null, vuelo);
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"id: "+id+"\n"+"Aerolinea: "+aerolinea);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "ok, nos vemos");
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
