package ABMLBobConstruye;

public abstract class Edificio {
	private String nombSupervisor;
	private int cantObreros;
	
	
	
	public Edificio(String nombSupervisor,int cantObreros) {
		this.nombSupervisor = nombSupervisor;
		this.cantObreros = cantObreros;
	}



	public String getNombSupervisor() {
		return nombSupervisor;
	}



	public void setNombSupervisor(String nombreSupervisor) {
		this.nombSupervisor = nombreSupervisor;
	}



	public int getCantObreros() {
		return cantObreros;
	}



	public void setCantObreros(int cantObreros) {
		this.cantObreros = cantObreros;
	}

}
