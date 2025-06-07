package practico2;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		Libro l = new Libro(null, null, null, null, 0);
		System.out.print("ingrese el titulo del libro: ");
		l.setTitulo(lector.next());
		System.out.print("ingrese el autor del libro: ");
		l.setAutor(lector.next());
		System.out.print("ingrese la fecha de publicacion del libro: ");
		l.setFecha(lector.next());
		System.out.print("cual es el genero del Libro? : ");
		l.setGenero(lector.next());
		System.out.print("ingrese el codigo identificativo del libro: ");
		l.setCodigoL(lector.nextInt());

		Revista revista = new Revista(null, null, null, null, null);
		System.out.print("ingrese el titulo de la revista: ");
		revista.setTitulo(lector.next());
		System.out.print("ingrese el autor  ");
		revista.setAutor(lector.next());
		System.out.print("ingrese la fecha en la que se publico ");
		revista.setFecha(lector.next());
		System.out.print("ingrese la edicion ");
		revista.setEdicion(lector.next());
		System.out.print("ingrese la seccion de la revista: ");
		revista.setSeccion(lector.next());

		ArticuloCientifico articulo = new ArticuloCientifico(null, null, null, null, 0);
		System.out.print("ingrese el titulo del articulo cientifico: ");
		articulo.setTitulo(lector.next());
		System.out.print("ingrese el autor del articulo  ");
		articulo.setAutor(lector.next());
		System.out.print("ingrese la fecha de publicacion del articulo : ");
		articulo.setFecha(lector.next());
		System.out.print("ingrese la fuente cientifica: ");
		articulo.setFuente(lector.next());
		System.out.print("ingrese el codigo identificativo del articulo: ");
		articulo.setCodigo(lector.nextInt());
		
		
		
		System.out.println("Titulo del libro: " + l.getTitulo() + "\n" + " Autor: " + l.getAutor() + "\n" + "fecha de publicacion: " + l.getFecha() + "\n" + "genero del libro: " + l.getGenero() + "\n" + "codigo identificativo del libro: "  + l.getCodigoL() 
		+ "\n" + "titulo de la revista: " + revista.getTitulo() + "\n" + "autor: " + revista.getAutor() + "\n" + "fecha de publiacion: " + revista.getFecha() + "\n" + "edicion: " + revista.getEdicion() + "\n" + "seccion de la entrevista: " + revista.getSeccion()
		+ "\n" + "titulo del articulo: " + articulo.getTitulo() + "\n" + "autor: " + articulo.getAutor() + "\n" + "fecha en la que se publico: " + articulo.getFecha() + "\n" + "fuente cientifica: " + articulo.getFuente() + "\n"  + "codigo identificativo del articulo: " + articulo.getCodigo());
		

	}
}
