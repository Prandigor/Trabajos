package BobConstruye;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);

		System.out.println("Edificio: --Casa--");
		System.out.println("Ingrese la Altura en metros: ");
		double alturaM = l.nextDouble();
		System.out.println("Ingrese el Ancho en metros: ");
		double anchoM = l.nextDouble();
		System.out.println("Ingrese la cantidad de Obreros: ");
		int cantObreros = l.nextInt();
		System.out.println("Ingrese el nombre de el Supervisor: ");
		String nombreSupervisor = l.next();
		System.out.println("Ingrese el tipo de piso de la casa: ");
		String tipoPiso = l.next();
		System.out.println("Ingrese el tipo de techo de la casa: ");
		String tipoTecho = l.next();
		System.out.println("Cantidad de puertas que tendra la casa: ");
		int cantPuertas = l.nextInt();
		System.out.println("Cantidad de ventanas que tendra la casa: ");
		int cantVentanas = l.nextInt();

		Casa csa1 = new Casa(alturaM, anchoM, cantObreros, nombreSupervisor, tipoPiso, tipoTecho, cantPuertas,
				cantVentanas);

		System.out.println("Edificio: --Apartamento--");
		System.out.println("Ingrese la Altura en metros: ");
		double alturaM2 = l.nextDouble();
		System.out.println("Ingrese el Ancho en metros: ");
		double anchoM2 = l.nextDouble();
		System.out.println("Ingrese la cantidad de Obreros: ");
		int cantObreros2 = l.nextInt();
		System.out.println("Ingrese el nombre de el Supervisor: ");
		String nombreSupervisor2 = l.next();
		System.out.println("Ingrese la zona en la que se vendera el Apartamento: ");
		String zona = l.next();
		System.out.println("Ingrese el precio en pesos que tendra el apartamento: ");
		int precio = l.nextInt();
		System.out.println("Ingrese la cantidad de inquilinos que podra ingresar: ");
		int inquilinos = l.nextInt();

		Apartamento ap1 = new Apartamento(alturaM2, anchoM2, cantObreros2, nombreSupervisor2, zona, precio, inquilinos);
		
		System.out.println("-- Casa --"+ "\n" + csa1);
		System.out.println(" ");
		System.out.println("-- Apartamento ---" + "\n" + ap1);
		
	}

}
