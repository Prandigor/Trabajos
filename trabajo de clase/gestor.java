package Empresa;

import java.util.*;
public class gestor {

	public static void main(String[] args) {
		encargado en1 = new encargado(null, 0);
		tecnico tec1 = new tecnico (null, 0);
		alterno al1 = new alterno (null, 0);
		Scanner lector = new Scanner(System.in);
		System.out.println("Bienvenido al gestion");
		System.out.println("Ingresa que eres");
		System.out.println("1- Encargado");
		System.out.println("2- Tecnico");
		System.out.println("3- Alterno");
		int opc = lector.nextInt();
		switch (opc) {
		case 1:
			en1.setEdad(10);
			en1.setNombre("gaspar, usted es encargado");
		System.out.println("Hola  " + en1.getNombre());
			
			en1.enviarmail();
			break;
		case 2: 
			
			tec1.setEdad(10);
			tec1.setNombre("gaspar, usted es tecnico");
		System.out.println("Hola  " + tec1.getNombre());
			
			tec1.enviarmail();
			break;
		case 3:
			al1.setEdad(10);
			al1.setNombre("gaspar, usted es encargado");
		System.out.println("Hola  " + al1.getNombre());
			
			al1.enviarmail();
			break;
		}
	
	}}
