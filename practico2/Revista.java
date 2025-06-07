package practico2;

public class Revista extends Publicacion {

	private String edicion, seccion;

	public Revista(String titulo, String autor, String fecha, String edicion, String seccion) {
		super(titulo, autor, fecha);
		this.edicion = edicion;
		this.seccion = seccion;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

}