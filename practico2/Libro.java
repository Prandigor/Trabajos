package practico2;

public class Libro extends Publicacion {

	private String genero;

	private int codigoL;

	public Libro(String titulo, String autor, String fecha, String genero, int codigoL) {
		super(titulo, autor, fecha);
		this.genero = genero;
		this.codigoL = codigoL;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCodigoL() {
		return codigoL;
	}

	public void setCodigoL(int codigoL) {
		this.codigoL = codigoL;
	}

}
