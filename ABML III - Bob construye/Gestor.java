package ABMLBobConstruye;

import java.util.*;

import SuperABML.Electronica;

public class Gestor {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int op;
		Casa[] Cas = new Casa[10];
		Apartamento[] Apa = new Apartamento[10];
		System.out.println("Bienvenido");
		do {

			System.out.println(" ");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Ingresar Casa");
			System.out.println("2- Ingresar Apartamento");
			System.out.println("3- Baja");
			System.out.println("4- Modificar");
			System.out.println("5- Salir");
			System.out.println(" ");
			op = l.nextInt();

			switch (op) {
			case 1:
				ingresarCasa(Cas, l);
				break;

			case 2:
				ingresarApartamento(Apa, l);
				break;

			case 3:
				System.out.println("Ingrese que tipo de Edificio deseas borrar");
				System.out.println("1- Casa");
				System.out.println("2- Apartamento");
				System.out.println("3- Volver");
				System.out.println(" ");
				op = l.nextInt();
				if (op == 1) {
					IsaListadoCasa(Cas);
					System.out.println(" ");
					borrarCasa(Cas, l);
				}
				if (op == 2) {

					IsaListadoApartamento(Apa);
					System.out.println(" ");
					borrarApartamento(Apa, l);
				}
				break;

			case 4:
				System.out.println("Ingrese a que tipo de Edificio desea Modificar");
				System.out.println("1- Numero de Puertas de Casa");
				System.out.println("2- Zona de un Apartamento");
				System.out.println("3- Volver");
				System.out.println(" ");
				op = l.nextInt();
				if (op == 1) {
					IsaListadoCasa(Cas);
					System.out.println(" ");
					cambiarCPCasa(Cas, l);
				}
				if (op == 2) {
					IsaListadoApartamento(Apa);
					System.out.println(" ");
					cambiarZApartamento(Apa, l);
				}
				break;

			case 5:
				System.out.println("Se terminó");
				break;
			default:
				System.out.println("Opción no disponible");

			}

		} while (op != 5);
	}

	public static void ingresarCasa(Casa[] Cas, Scanner l) {

		System.out.println("Ingrese el nombre de el Supervisor: ");
		String nombSupervisor = l.next();
		System.out.println("Ingrese la cantidad de Obreros: ");
		int cantObreros = l.nextInt();
		System.out.println("Ingrese el tipo de piso de la casa: ");
		String tipoPiso = l.next();
		System.out.println("Cantidad de puertas que tendra la casa: ");
		int cantPuertas = l.nextInt();

		for (int i = 0; i < Cas.length; i++) {
			if (Cas[i] == null) {
				Cas[i] = new Casa(nombSupervisor, cantObreros, tipoPiso, cantPuertas);
				break;
			}
		}

	}

	public static void ingresarApartamento(Apartamento[] Apa, Scanner l) {

		System.out.println("Ingrese el nombre de el Supervisor: ");
		String nombSupervisor = l.next();
		System.out.println("Ingrese la cantidad de Obreros: ");
		int cantObreros = l.nextInt();
		System.out.println("Ingrese la zona en la que estará el Apartamento: ");
		String zona = l.next();
		System.out.println("Precio de el Apartamento: ");
		int precio = l.nextInt();

		for (int i = 0; i < Apa.length; i++) {
			if (Apa[i] == null) {
				Apa[i] = new Apartamento(nombSupervisor, cantObreros, zona, precio);
				break;
			}
		}

	}

	public static void borrarCasa(Casa[] Cas, Scanner l) {

		System.out.println("Ingrese el supervisor de la Casa que desea borrar: ");
		String nombSupervisor = l.next();
		for (int i = 0; i < Cas.length; i++) {
			if (Cas[i] != null && Cas[i].getNombSupervisor() == nombSupervisor) {
				Cas[i] = null;
			} else {
				System.out.println("Nombre de supervisor incorrecto");
			}

		}

	}

	public static void borrarApartamento(Apartamento[] Apa, Scanner l) {

		System.out.println("Ingrese el supervisor del Apartamento que desea borrar: ");
		String nombSupervisor = l.next();
		for (int i = 0; i < Apa.length; i++) {
			if (Apa[i] != null && Apa[i].getNombSupervisor() == nombSupervisor) {
				Apa[i] = null;
			} else {
				System.out.println("Nombre de supervisor incorrecto");
			}

		}

	}

	public static void IsaListadoCasa(Casa[] Cas) {
		System.out.println("--- C A S A ---");
		for (int i = 0; i < Cas.length; i++) {
			if (Cas[i] != null) {
				System.out.println("Pos N°: " + i);
				System.out.print("Nombre Supervisor: " + Cas[i].getNombSupervisor());
				System.out.print(" Cantidad Obreros: " + Cas[i].getCantObreros());
				System.out.println(" Cantidad Puertas: " + Cas[i].getCantPuertas());
				System.out.println(" Tipo Piso: " + Cas[i].getTipoPiso());

			} else {
				System.out.println("Pos N°" + i + "esta vacia");
			}
		}
	}

	public static void IsaListadoApartamento(Apartamento[] Apa) {
		System.out.println("--- A P A R T A M E N T O ---");
		for (int i = 0; i < Apa.length; i++) {
			if (Apa[i] != null) {
				System.out.println("Pos N°: " + i);
				System.out.print("Nombre Supervisor: " + Apa[i].getNombSupervisor());
				System.out.print(" Cantidad Obreros: " + Apa[i].getCantObreros());
				System.out.println(" Cantidad Puertas: " + Apa[i].getZona());
				System.out.println(" Tipo Piso: " + Apa[i].getPrecio());

			} else {
				System.out.println("Pos N°" + i + "esta vacia");
			}
		}

	}

	public static void cambiarCPCasa(Casa[] Cas, Scanner l) {
		System.out.println("Ingrese el nombre de el Supervisor de la casa que desea cambiarle el Numero de puertas: ");
		String nS = l.next();
		for (int i = 0; i < Cas.length; i++) {
			if (Cas[i] != null && Cas[i].getNombSupervisor() == nS) {
				System.out.println("Ingrese la nueva Cantidad de Puertas: ");
				int cP = l.nextInt();
				Cas[i].setCantPuertas(cP);
			}

		}
	}
	public static void cambiarZApartamento(Apartamento[] Apa, Scanner l) {	
		System.out.println("Ingrese el nombre de el Supervisor del Apartemento que desea cambiarle la Zona: ");
		String nS = l.next();
		for (int i = 0; i < Apa.length; i++) {
			if (Apa[i] != null && Apa[i].getNombSupervisor() == nS) {
				System.out.println("Ingrese la nueva Zona: ");
				String zona = l.next();
				Apa[i].setZona(zona);
			}

		}
	}
}
