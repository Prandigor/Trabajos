package Arte;

public class Pintura extends ObraArte {
 String medida, tipodepintura;
 int precio;
	public Pintura(String autor, String donde, int fecha, String medida, String tipo, int precio) {
		super(autor, donde, fecha);
		this.medida = medida;
		this.tipodepintura = tipo;
		this.precio = precio;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public String getTipodepintura() {
		return tipodepintura;
	}
	public void setTipodepintura(String tipodepintura) {
		this.tipodepintura = tipodepintura;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
