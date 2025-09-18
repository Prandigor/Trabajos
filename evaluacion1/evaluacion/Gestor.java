package PruebaP;

import javax.swing.table.DefaultTableModel;

public class Gestor {

	MySQL bd = new MySQL();
	
	public static void main(String[] args) {
		
		Presentacion a = new Presentacion();
		a.setVisible(true);
		
		
		
		

	}
	
	public void listar (DefaultTableModel modelo){
		bd.listar(modelo);
		
	}

}
