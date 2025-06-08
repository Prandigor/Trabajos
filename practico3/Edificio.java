package BobConstruye;

public abstract class Edificio {

	 String nombreSupervisor;
	 double alturaM, anchoM;
	 int cantObreros;

	public Edificio(double alturaM,double anchoM, int cantObreros,String nombreSupervisor) {

		this.alturaM = alturaM;
		this.anchoM = anchoM;
		this.cantObreros = cantObreros;
		this.nombreSupervisor = nombreSupervisor;
	}

	
}
