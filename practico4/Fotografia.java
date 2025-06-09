package Arte;

public class Fotografia extends  ObraArte {
	String almacenamiento;
double altura, ancho;
	public Fotografia(String autor, String donde, int fecha, String almacenamiento, double altura, double ancho) {
		super(autor, donde, fecha);
		this.almacenamiento = almacenamiento;
		this.altura = altura;
		this.ancho = ancho;
	}
	public String getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

}
