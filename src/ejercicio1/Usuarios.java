package ejercicio1;

import javax.swing.JOptionPane;

public class Usuarios {
	protected String nombre;
	protected int edad;
	protected String id;
	public Usuarios(String nombre, int edad, String id) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", edad=" + edad + ", id=" + id + "]";
	}
	public void Registrarse() {
		nombre=validarCaracteres("ingrese su nombre");
		edad=validarNumeros("ingrese su edad");
		id=validarCaracteres("ingrese su id");
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
