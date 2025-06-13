package SuperABML;

public class Alimento extends Producto{
	
	private String fVenc, proceso;
	private double calorias;
	
	
	
	public Alimento(double codigo, String nombre, double precio, String fVenc,String proceso,double calorias) {
		super(codigo, nombre, precio);
		this.fVenc = fVenc;
		this.proceso = proceso;
		this.calorias = calorias;
		
		
	}



	public String getfVenc() {
		return fVenc;
	}



	public void setfVenc(String fechVenc) {
		this.fVenc = fechVenc;
	}



	public String getProceso() {
		return proceso;
	}



	public void setProceso(String proceso) {
		this.proceso = proceso;
	}



	public double getCalorias() {
		return calorias;
	}



	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

}