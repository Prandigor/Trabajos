package ABMLBobConstruye;

public class Casa extends Edificio{

	private String tipoPiso;
	private int cantPuertas;
	
	public Casa(String nombSupervisor, int cantObreros,String tipoPiso,int cantPuertas) {
		super(nombSupervisor, cantObreros);
		this.tipoPiso = tipoPiso;
		this.cantPuertas = cantPuertas;
		
	}

	public String getTipoPiso() {
		return tipoPiso;
	}

	public void setTipoPiso(String tipoPiso) {
		this.tipoPiso = tipoPiso;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

	
	
	
}
