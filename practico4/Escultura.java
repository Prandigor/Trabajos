package Arte;

public class Escultura extends ObraArte {
 String perimetro, altura;
 int precio;
	public Escultura(String autor, String donde, int fecha, String perimetro, String altura, int precio) {
		super(autor, donde, fecha);
		this.perimetro = perimetro;
		this.altura = altura;
		this.precio = precio;
		
	}
	public String getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(String perimetro) {
		this.perimetro = perimetro;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
