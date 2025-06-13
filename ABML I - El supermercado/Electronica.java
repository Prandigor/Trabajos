package SuperABML;

public class Electronica extends Producto{

	private String categoria;
	private double voltios;
	
	
	
	
	public Electronica(double codigo, String nombre, double precio, String categoria, double voltios) {
		super(codigo, nombre, precio);
		this.categoria = categoria;
		this.voltios = voltios;
		
	}




	public String getCategoria() {
		return categoria;
	}




	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}




	public double getVoltios() {
		return voltios;
	}




	public void setVoltios(double voltios) {
		this.voltios = voltios;
	}

}