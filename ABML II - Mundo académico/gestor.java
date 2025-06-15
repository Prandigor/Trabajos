package practico2;

import java.util.Scanner;

public class gestor {


		public static void main(String[] args) {
			Scanner l = new Scanner(System.in);
			int op;
			ArticuloCientifico[] eArr = new ArticuloCientifico[10];
			Libro[] rArr = new Libro[10];
			Revista[] aArr = new Revista[10];
			do {

				System.out.println("Bienvenido");
				System.out.println("Ingresa opcion deseada:");
				System.out.println("1- Ingresar un Articulo cientifico");
				System.out.println("2- Ingresar un libro");
				System.out.println("3- Ingresar una revista");
				System.out.println("4- Cambiar un tipo de producto");
				System.out.println("5- Mostrar lista de los productos");
				System.out.println("6- Dar de baja un producto");
				System.out.println("7- salir");
				System.out.println(" ");
				op = l.nextInt();

				switch (op) {
				case 1:
					ingresarArticulo(eArr, l);
					break;

				case 2:
					ingresarLibro(rArr,l);
					break;
				
				case 3:
					ingresarRevista(aArr, l);
					break;

				case 4:
					System.out.println("Seleccione una opcion: ");
					System.out.println("1- camiar Titulo de Articulo cientifico");
					System.out.println("2- cambiar Titulo del libro");
					System.out.println("3- cambiar Titulo de la revista");
					System.out.println("4- volver");
					op = l.nextInt();
					if (op == 1) {
						JuanListadoA(eArr);
						System.out.println(" ");
						cambiarTArticulo(eArr, l);
					}
					if (op == 2) {
						JuanListadol(rArr);
						System.out.println(" ");
						cambiarTLibro(rArr, l);
					}
					if (op == 3) {
						JuanListadoR(aArr);
						System.out.println(" ");
						cambiarTRevista(aArr, l);
					}
					break;

				case 5:
					JuanListadoA(eArr);
					System.out.println(" ");
					System.out.println(" ");

					JuanListadol(rArr);
					System.out.println(" ");
					System.out.println(" ");

					JuanListadoR(aArr);
					System.out.println(" ");
					System.out.println(" ");

					break;
					
				case 6:
					System.out.println("Ingrese que tipo de Producto deseas borrar");
					System.out.println("1- ArticuloCientifico");
					System.out.println("2- Libro");
					System.out.println("3- Revista");
					System.out.println("4- volver");
					op = l.nextInt();
					if (op == 1) {
						JuanListadoA(eArr);
						System.out.println(" ");
						borrarArticulo(eArr, l);
					}
					if (op == 2) {
						JuanListadol(rArr);
						System.out.println(" ");
						borrarLibro(rArr, l);
					}
					if (op == 3) {
						JuanListadoR(aArr);
						System.out.println(" ");
						borrarRevista(aArr, l);
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

		public static void JuanListadoA(ArticuloCientifico[] eArr) {
			System.out.println("--- Articulo Cientifico  ---");
			for (int i = 0; i < eArr.length; i++) {
				if (eArr[i] != null) {
					System.out.println("Pos N°: " + i);
					System.out.print("Titulo: " + eArr[i].getTitulo());
					System.out.print(" Autor: " + eArr[i].getAutor());
					System.out.println(" Fecha: " + eArr[i].getFecha());
					System.out.println(" Fuente: " + eArr[i].getFuente());
					System.out.println(" Codigo: " + eArr[i].getCodigo());
				} else {
					System.out.println("Pos N°" + i + "esta vacia");
				}
			}
		}

		public static void JuanListadol(Libro[] eArr) {
			System.out.println("--- Libro ---");
			for (int i = 0; i < eArr.length; i++) {
				if (eArr[i] != null) {
					System.out.println("Pos N°: " + i);
					System.out.print("Titulo: " + eArr[i].getTitulo());
					System.out.print(" Autor: " + eArr[i].getAutor());
					System.out.println(" Fecha: " + eArr[i].getFecha());
					System.out.println(" Generol: " + eArr[i].getGenero());
					System.out.println(" Codigo: " + eArr[i].getCodigoL());
					
				} else {
					System.out.println("Pos N°" + i + "esta vacia");
				}
			}
		}

		public static void JuanListadoR(Revista[] aArr) {
			System.out.println("--- Revista ---");
			for (int i = 0; i < aArr.length; i++) {
				if (aArr[i] != null) {
					System.out.println("Pos N°: " + i);
					System.out.print("Titulo: " + aArr[i].getTitulo());
					System.out.print(" Autor: " + aArr[i].getAutor());
					System.out.println(" Fecha: " + aArr[i].getFecha());;
					System.out.println(" Edicion: " + aArr[i].getEdicion());
					System.out.println(" Seccion: " + aArr[i].getSeccion());
					
				} else {
					System.out.println("Pos N°" + i + "esta vacia");
				}
			}
		}

		public static void ingresarArticulo(ArticuloCientifico[] eArr, Scanner l) {
			System.out.println("Ingresa titulo: ");
			String titulo = l.next();
			System.out.println("Ingresa Nombre del autor: ");
			String autor = l.next();
			System.out.println("Ingresa fecha en la que se publico: ");
			String fecha = l.next();
			System.out.println("Ingresa fuente ");
			String fuente = l.next();
			System.out.println("Ingresa el codigo: ");
			int codigo = l.nextInt();

			for (int i = 0; i < eArr.length; i++) {
				if (eArr[i] == null) {
					eArr[i] = new ArticuloCientifico(fuente, autor, fecha, fuente, codigo);
					break;
				}
				
			}
		}

		public static void ingresarLibro(Libro[] rArr, Scanner l) {
			System.out.println("Ingresa titulo: ");
			String titulo = l.next();
			System.out.println("Ingresa Nombre del autor: ");
			String autor = l.next();
			System.out.println("Ingresa fecha en la que se publico: ");
			String fecha = l.next();
			System.out.println("Ingresa genero : ");
			String genero = l.next();
			System.out.println("Ingresa codigo de libro : ");
			int codigo = l.nextInt();
		

			for (int i = 0; i < rArr.length; i++) {
				if (rArr[i] == null) {
					rArr[i] = new Libro(titulo, autor, fecha, genero, codigo);
					break;

				}
	break;
			}
		}
		public static void ingresarRevista(Revista[] aArr, Scanner l) {
			System.out.println("Ingresa titulo: ");
			String titulo = l.next();
			System.out.println("Ingresa Nombre del autor: ");
			String autor = l.next();
			System.out.println("Ingresa fecha en la que se publico: ");
			String fecha = l.next();
			System.out.println("Ingresa edicion de la revista : ");
			String edicion = l.next();
			System.out.println("Ingresa seccion: ");
			String seccion = l.next();
			

			for (int i = 0; i < aArr.length; i++) {
				if (aArr[i] == null) {
					aArr[i] = new Revista(titulo,autor,fecha,edicion,seccion);
					break;
				}
			}
		}
		public static void borrarArticulo(ArticuloCientifico[] eArr, Scanner l) {
			
			System.out.println("Ingrese el codigo de el Articulo que desea eliminar:: ");
			int codigo = l.nextInt();
			for (int i = 0; i < eArr.length; i++) {
				if (eArr[i] != null && eArr[i].getCodigo() == codigo) {
					eArr[i] = null;
				}else {
					System.out.println("Codigo incorrecto");
					break;
				}
				

			}

		}
		public static void borrarLibro(Libro[] rArr, Scanner l) {
			System.out.println("Ingrese el codigo de el Libro que desea eliminar:: ");
			int codigo = l.nextInt();
			for (int i = 0; i < rArr.length; i++) {
				if (rArr[i] != null && rArr[i].getCodigoL() == codigo) {
					rArr[i] = null;
				}else {
					System.out.println("Codigo incorrecto");
					break;
				}
				

			}

		}
		public static void borrarRevista(Revista[] aArr, Scanner l) {
			System.out.println("Ingrese el titulo de la revista que desea eliminar:: ");
			String titulo = l.next();
			for (int i = 0; i < aArr.length; i++) {
				if (aArr[i] != null && aArr[i].getTitulo() == titulo) {
					aArr[i] = null;
				}else {
					System.out.println("titulo incorrecto");
				}
				

			}

		}
		public static void cambiarTArticulo(ArticuloCientifico[] eArr, Scanner l) {	
			System.out.println("Ingrese el codigo de el Articulo que desea cambiarle el Titulo");
			int codigo = l.nextInt();
			for (int i = 0; i < eArr.length; i++) {
				if (eArr[i] != null && eArr[i].getCodigo() == codigo) {
					System.out.println("Ingrese el nuevo titulo: ");
					String nombre = l.next();
					eArr[i].setTitulo(nombre);
				}

			}
		}
		public static void cambiarTLibro(Libro[] rArr, Scanner l) {	
			System.out.println("Ingrese el codigo de el Libro que desea cambiarle el titulo");
			int codigo = l.nextInt();
			for (int i = 0; i < rArr.length; i++) {
				if (rArr[i] != null && rArr[i].getCodigoL() == codigo) {
					System.out.println("Ingrese el nuevo Titulo: ");
					String titulo = l.next();
					rArr[i].setCodigoL(codigo);
				}

			}
		}
		public static void cambiarTRevista(Revista[] aArr, Scanner l) {	
			System.out.println("Ingrese el codigo de el progucto que desea cambiarle el titulo");
			String titulo = l.next();
			for (int i = 0; i < aArr.length; i++) {
				if (aArr[i] != null && aArr[i].getTitulo() == titulo) {
					System.out.println("Ingrese el nuevo titulo: ");
					String Titulo = l.next();
					aArr[i].setTitulo(titulo);
				}

			}
		}
	}