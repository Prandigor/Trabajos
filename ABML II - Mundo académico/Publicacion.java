package practico2;

public class Publicacion {
	private String titulo, autor, fecha;

	public Publicacion(String titulo, String autor, String fecha) {
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
