package SuperABML;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int op;
		Electronica[] eArr = new Electronica[10];
		Ropa[] rArr = new Ropa[10];
		Alimento[] aArr = new Alimento[10];
		do {

			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Ingresar un dispositivo Electronico");
			System.out.println("2- Ingresar un tipo de Ropa");
			System.out.println("3- Ingresar un tipo de Alimento");
			System.out.println("4- Cambiar un tipo de producto");
			System.out.println("5- Mostrar lista de los productos");
			System.out.println("6- Dar de baja un producto");
			System.out.println("7- salir");
			System.out.println(" ");
			op = l.nextInt();

			switch (op) {
			case 1:
				ingresarElectro(eArr, l);
				break;

			case 2:
				ingresarRopa(rArr,l);
				break;
			
			case 3:
				ingresarAlimento(aArr, l);
				break;

			case 4:
				System.out.println("Seleccione una opcion: ");
				System.out.println("1- camiar nombre de producto Electronica");
				System.out.println("2- cambiar precio de producto Ropa");
				System.out.println("3- cambiar calorias de producto Alimento");
				System.out.println("4- volver");
				op = l.nextInt();
				if (op == 1) {
					HectorListadoEl(eArr);
					System.out.println(" ");
					cambiarNElectro(eArr, l);
				}
				if (op == 2) {
					HectorListadoRo(rArr);
					System.out.println(" ");
					cambiarPRopa(rArr, l);
				}
				if (op == 3) {
					HectorListadoAl(aArr);
					System.out.println(" ");
					cambiarCAlimento(aArr, l);
				}
				break;

			case 5:
				HectorListadoEl(eArr);
				System.out.println(" ");
				System.out.println(" ");

				HectorListadoRo(rArr);
				System.out.println(" ");
				System.out.println(" ");

				HectorListadoAl(aArr);
				System.out.println(" ");
				System.out.println(" ");

				break;
				
			case 6:
				System.out.println("Ingrese que tipo de Producto deseas borrar");
				System.out.println("1- Electronica");
				System.out.println("2- Ropa");
				System.out.println("3- Alimento");
				System.out.println("4- volver");
				op = l.nextInt();
				if (op == 1) {
					HectorListadoEl(eArr);
					System.out.println(" ");
					borrarElectro(eArr, l);
				}
				if (op == 2) {
					HectorListadoRo(rArr);
					System.out.println(" ");
					borrarRopa(rArr, l);
				}
				if (op == 3) {
					HectorListadoAl(aArr);
					System.out.println(" ");
					borrarAlimento(aArr, l);
				}
				break;

			case 7:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}

		} while (op != 7);

	}

	public static void HectorListadoEl(Electronica[] eArr) {
		System.out.println("--- E L E C T R O N I C A  ---");
		for (int i = 0; i < eArr.length; i++) {
			if (eArr[i] != null) {
				System.out.println("Pos N°: " + i);
				System.out.print("Codigo: " + eArr[i].getCodigo());
				System.out.print(" Nombre: " + eArr[i].getNombre());
				System.out.println(" Precio: " + eArr[i].getPrecio());
				System.out.println(" Categoria: " + eArr[i].getCategoria());
				System.out.println(" Voltios: " + eArr[i].getVoltios());
			} else {
				System.out.println("Pos N°" + i + "esta vacia");
			}
		}
	}

	public static void HectorListadoRo(Ropa[] eArr) {
		System.out.println("--- R O P A ---");
		for (int i = 0; i < eArr.length; i++) {
			if (eArr[i] != null) {
				System.out.println("Pos N°: " + i);
				System.out.print("Codigo: " + eArr[i].getCodigo());
				System.out.print(" Nombre: " + eArr[i].getNombre());
				System.out.println(" Precio: " + eArr[i].getPrecio());
				System.out.println(" Material: " + eArr[i].getMaterial());
				System.out.println(" Color: " + eArr[i].getColor());
				System.out.println(" Talle: " + eArr[i].getTalle());
			} else {
				System.out.println("Pos N°" + i + "esta vacia");
			}
		}
	}

	public static void HectorListadoAl(Alimento[] aArr) {
		System.out.println("--- A L I M E N T O ---");
		for (int i = 0; i < aArr.length; i++) {
			if (aArr[i] != null) {
				System.out.println("Pos N°: " + i);
				System.out.print("Codigo: " + aArr[i].getCodigo());
				System.out.print(" Nombre: " + aArr[i].getNombre());
				System.out.println(" Precio: " + aArr[i].getPrecio());
				System.out.println(" Fecha de vencimiento: " + aArr[i].getfVenc());
				System.out.println(" Proceso: " + aArr[i].getProceso());
				System.out.println(" Calorias: " + aArr[i].getCalorias());
			} else {
				System.out.println("Pos N°" + i + "esta vacia");
			}
		}
	}

	public static void ingresarElectro(Electronica[] eArr, Scanner l) {
		System.out.println("Ingresa Codigo: ");
		double codigo = l.nextDouble();
		System.out.println("Ingresa Nombre: ");
		String nombre = l.next();
		System.out.println("Ingresa Precio: ");
		double precio = l.nextDouble();
		System.out.println("Ingresa Categoria : ");
		String categoria = l.next();
		System.out.println("Ingresa voltios: ");
		double voltios = l.nextDouble();

		for (int i = 0; i < eArr.length; i++) {
			if (eArr[i] == null) {
				eArr[i] = new Electronica(codigo, nombre, precio, categoria, voltios);
				break;
			}
		}
	}

	public static void ingresarRopa(Ropa[] rArr, Scanner l) {
		System.out.println("Ingresa Codigo: ");
		double codigo = l.nextDouble();
		System.out.println("Ingresa Nombre: ");
		String nombre = l.next();
		System.out.println("Ingresa Precio: ");
		double precio = l.nextDouble();
		System.out.println("Ingresa Material : ");
		String material = l.next();
		System.out.println("Ingresa Color : ");
		String color = l.next();
		System.out.println("Ingresa Talle : ");
		String talle = l.next();

		for (int i = 0; i < rArr.length; i++) {
			if (rArr[i] == null) {
				rArr[i] = new Ropa(codigo, nombre, precio, material, color, talle);
				break;

			}

		}
	}
	public static void ingresarAlimento(Alimento[] aArr, Scanner l) {
		System.out.println("Ingresa Codigo: ");
		double codigo = l.nextDouble();
		System.out.println("Ingresa Nombre: ");
		String nombre = l.next();
		System.out.println("Ingresa Precio: ");
		double precio = l.nextDouble();
		System.out.println("Ingresa fecha de Vencimiento : ");
		String fVenc = l.next();
		System.out.println("Ingresa si tiene algun proceso : ");
		String proceso = l.next();
		System.out.println("Ingresa calorias: ");
		double calorias = l.nextDouble();

		for (int i = 0; i < aArr.length; i++) {
			if (aArr[i] == null) {
				aArr[i] = new Alimento(codigo, nombre, precio, fVenc, proceso,calorias);
				break;
			}
		}
	}
	public static void borrarElectro(Electronica[] eArr, Scanner l) {
		ingresarElectro(eArr, l);
		System.out.println("Ingrese el codigo de el producto que desea eliminar:: ");
		int codigo = l.nextInt();
		for (int i = 0; i < eArr.length; i++) {
			if (eArr[i] != null && eArr[i].getCodigo() == codigo) {
				eArr[i] = null;
			}else {
				System.out.println("Codigo incorrecto");
			}
			

		}

	}
	public static void borrarRopa(Ropa[] rArr, Scanner l) {
		ingresarRopa(rArr, l);
		System.out.println("Ingrese el codigo de el producto que desea eliminar:: ");
		int codigo = l.nextInt();
		for (int i = 0; i < rArr.length; i++) {
			if (rArr[i] != null && rArr[i].getCodigo() == codigo) {
				rArr[i] = null;
			}else {
				System.out.println("Codigo incorrecto");
			}
			

		}

	}
	public static void borrarAlimento(Alimento[] aArr, Scanner l) {
		ingresarAlimento(aArr, l);
		System.out.println("Ingrese el codigo de el producto que desea eliminar:: ");
		int codigo = l.nextInt();
		for (int i = 0; i < aArr.length; i++) {
			if (aArr[i] != null && aArr[i].getCodigo() == codigo) {
				aArr[i] = null;
			}else {
				System.out.println("Codigo incorrecto");
			}
			

		}

	}
	public static void cambiarNElectro(Electronica[] eArr, Scanner l) {	
		System.out.println("Ingrese el codigo de el progucto que desea cambiarle el Nombre");
		String codigo = l.next();
		for (int i = 0; i < eArr.length; i++) {
			if (eArr[i] != null && eArr[i].getNombre() == codigo) {
				System.out.println("Ingrese el nuevo nombre: ");
				String nombre = l.next();
				eArr[i].setNombre(nombre);
			}

		}
	}
	public static void cambiarPRopa(Ropa[] rArr, Scanner l) {	
		System.out.println("Ingrese el codigo de el progucto que desea cambiarle el Precio");
		String codigo = l.next();
		for (int i = 0; i < rArr.length; i++) {
			if (rArr[i] != null && rArr[i].getNombre() == codigo) {
				System.out.println("Ingrese el nuevo precio: ");
				double precio = l.nextDouble();
				rArr[i].setPrecio(precio);
			}

		}
	}
	public static void cambiarCAlimento(Alimento[] aArr, Scanner l) {	
		System.out.println("Ingrese el codigo de el progucto que desea cambiarle las Calorias");
		String codigo = l.next();
		for (int i = 0; i < aArr.length; i++) {
			if (aArr[i] != null && aArr[i].getNombre() == codigo) {
				System.out.println("Ingrese las nuevas Calorias: ");
				double calorias = l.nextDouble();
				aArr[i].setCalorias(calorias);
			}

		}
	}
}
