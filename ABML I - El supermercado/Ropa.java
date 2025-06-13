package SuperABML;

public class Ropa extends Producto{

	private String material,color, talle;
	
	public Ropa(double codigo, String nombre, double precio, String material,String color,String talle) {
		super(codigo, nombre, precio);
		this.material = material;
		this.color = color;
		this.talle = talle;
		
		
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

}