package BobConstruye;

public class Apartamento extends Edificio {

	String zona;
	int precio, inquilinos;

	public Apartamento(double alturaM, double anchoM, int cantObreros, String nombreSupervisor, String zona, int precio,
			int inquilinos) {
		super(alturaM, anchoM, cantObreros, nombreSupervisor);
		this.zona = zona;
		this.precio = precio;
		this.inquilinos = inquilinos;

	}

	public String toString() {
		return "Nombre de el Supervisor: " + nombreSupervisor + "Altura: " + alturaM + "M" + "\n" + "Ancho: " + anchoM
				+ "M" + "\n" + "Cantidad de Obreros: " + cantObreros + "\n" + "Zona del Apartamento: " + zona + "\n"
				+ "Precio del Apartamento: " + precio + "UYU" + "\n" + "Inquilinos: " + inquilinos;
	}
}
