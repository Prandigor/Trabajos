package ABMLBobConstruye;

public class Apartamento extends Edificio{
	private String zona;
	private int precio;
	
	public Apartamento(String nombSupervisor, int cantObreros,String zona,int precio) {
		super(nombSupervisor, cantObreros);
		this.zona = zona;
		this.precio = precio;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
