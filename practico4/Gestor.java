package Arte;

import java.util.*;

public class Gestor {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		Pintura p = new Pintura (null, null, 0, null, null, 0);
		System.out.println("---P-I-N-T-U-R-A---");
		System.out.println("ingrese el autor: ");
		p.setAutor(l.next());
		System.out.println("ingrese donde se expone  ");
		p.setDonde(l.next());
		System.out.println("ingrese la fecha en la que creo: ");
		p.setFechadecreacion(l.nextInt());
		System.out.println("ingrese la medida: ");
		p.setMedida(l.next());
		System.out.println("ingrese el tipo de pintura: ");
		p.setTipodepintura(l.next());
		System.out.println("ingrese el precio");
		p.setPrecio(l.nextInt());
		
		Fotografia f = new Fotografia(null, null, 0, null, 0, 0);
		System.out.println("F-O-T-O-G-R-A-F-I-A");
		System.out.println("ingrese el autor: ");
		f.setAutor(l.next());
		System.out.println("ingrese donde se expone  ");
		f.setDonde(l.next());
		System.out.println("ingrese la fecha en la que creo: ");
		f.setFechadecreacion(l.nextInt());
		System.out.println("ingrese el tamaño que ocupa la imagenes en MB: ");
		f.setAlmacenamiento(l.next());
		System.out.println("ingrese la altura de la imagen: ");
		f.setAltura(l.nextDouble());
		System.out.println("ingrese el ancho de la imagen: ");
		f.setAncho(l.nextDouble());
		
		
		Escultura e = new Escultura (null, null, 0, null, null, 0);
		System.out.println("E-S-C-U-L-T-U-R-A");
		System.out.println("ingrese el autor: ");
		e.setAutor(l.next());
		System.out.println("ingrese donde se expone  ");
		e.setDonde(l.next());
		System.out.println("ingrese la fecha en la que creo: ");
		e.setFechadecreacion(l.nextInt());
		System.out.println("ingrese el perimetro que ocupa en metros: ");
		e.setPerimetro(l.next());
		System.out.println("ingrese la altura de la escultura: ");
        e.setAltura(l.next());
        System.out.println("ingrese el precio: ");
        e.setPrecio(l.nextInt());
        
        
        System.out.println("Pintura)"+"\n" + "autor: " + p.getAutor() + "\n" + "donde se expone: " + p.getDonde() + "\n"+ "fecha: " + p.getFechadecreacion() + "\n"+ "medida: " + p.getMedida()+ "\n"+ "tipo de pintura: "+p.getTipodepintura()+ "\n"+ "precio: " + p.getPrecio() + "\n" );
        System.out.println("Fotografia) "+"\n" + "autor: " + f.getAutor() + "\n" + "donde se expone: " + f.getDonde() + "\n"+ "fecha: " + f.getFechadecreacion() +"\n" + "tamaño que ocupa: " + f.getAlmacenamiento()+"\n" + "altura : " + f.getAltura() + "\n" + "ancho : " + f.getAncho() +"\n" );
        System.out.println("Escultura)"+"\n" + "autor: " + e.getAutor() + "\n" + "donde se expone: " + e.getDonde() + "\n"+ "fecha: " + e.getFechadecreacion() + "\n" + "ocupa el perimetro de: " + e.getPerimetro() + "\n" + "altura: " + e.getAltura() + "\n" + "precio: " + e.getPrecio()  );
	}

}
