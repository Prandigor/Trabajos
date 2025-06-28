package Empresa;

import java.util.Scanner;


	public class alterno implements mail {
		String nombre;
		int edad;

		public alterno (String nombre, int edad) {
			
			this.nombre = nombre;
			this.edad = edad;
			

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

		@Override
		public void enviarmail() {
			Scanner lector = new Scanner(System.in);

			System.out.println("enviar mail a:  ");
			System.out.println("1-Tecnico");
			System.out.println("2-encargado");
			int ad = lector.nextInt();
			switch (ad) {
			case 1:

				System.out.println("Escriba el mail: ");
				String a = lector.next();
				System.out.println("el mail que usted envio fue: " + a);

				break;
			case 2:
				System.out.println("no tiene los permisos necesarios para enviar el mail");

			default:
				break;
}}}