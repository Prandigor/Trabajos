package Arte;

public class ObraArte {
	String autor, donde;
	int fechadecreacion;
	
	public ObraArte (String autor, String donde, int fecha) {
		
		this.autor = autor;
		this.donde = donde;
		this.fechadecreacion = fecha;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDonde() {
		return donde;
	}

	public void setDonde(String donde) {
		this.donde = donde;
	}

	public int getFechadecreacion() {
		return fechadecreacion;
	}

	public void setFechadecreacion(int fechadecreacion) {
		this.fechadecreacion = fechadecreacion;
	}
	
	
}
