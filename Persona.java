package Persona;

	

	public abstract class Persona {

		private String nombreCompleto, fechNacimiento;
		private int CI;
		
	


		public Persona(String nc, int cI, String fN) {
			super();
			this.nombreCompleto = nc;
			this.fechNacimiento = fN;
			this.CI = cI;
		}




		public String getNombreCompleto() {
			return nombreCompleto;
		}




		public void setNombreCompleto(String nombreCompleto) {
			this.nombreCompleto = nombreCompleto;
		}




		public String getFechNacimiento() {
			return fechNacimiento;
		}




		public void setFechNacimiento(String fechNacimiento) {
			this.fechNacimiento = fechNacimiento;
		}




		public int getCI() {
			return CI;
		}




		public void setCI(int cI) {
			CI = cI;
		}

	}
