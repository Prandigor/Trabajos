package practico2;

public class ArticuloCientifico extends Publicacion {
	private String fuente;
	private int codigo;

	public ArticuloCientifico(String titulo, String autor, String fecha, String fuente, int codigo) {
		super(titulo, autor, fecha);

		this.fuente = fuente;

		this.codigo = codigo;

	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
