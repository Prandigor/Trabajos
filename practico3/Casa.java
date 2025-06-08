package BobConstruye;

public class Casa extends Edificio {

	String tipoPiso, tipoTecho;
	int cantPuertas, cantVentanas;

	public Casa(double alturaM, double anchoM, int cantObreros, String nombreSupervisor, String tipoPiso,
			String tipoTecho, int cantPuertas, int cantVentanas) {
		super(alturaM, anchoM, cantObreros, nombreSupervisor);
		this.tipoPiso = tipoPiso;
		this.tipoTecho = tipoTecho;
		this.cantPuertas = cantPuertas;
		this.cantVentanas = cantVentanas;

	}

	public String toString() {
		return "Nombre de el Supervisor: " + nombreSupervisor + "Altura: " + alturaM + "M" + "\n" + "Ancho: " + anchoM
				+ "M" + "\n" + "Cantidad de Obreros: " + cantObreros + "\n" + "Tipo de Techo: " + tipoTecho
				+ "Tipo de Piso: " + tipoPiso + "\n" + "Cantidad de Ventanas de la casa: " + cantPuertas + "\n"
				+ "Cantidad de Ventanas de la casa: " + cantVentanas;
	}

}
