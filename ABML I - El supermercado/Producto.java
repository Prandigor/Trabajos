package SuperABML;

public abstract class Producto {
	private double codigo,precio;
	private String nombre;

	public Producto(double codigo,String nombre,double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
				
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}