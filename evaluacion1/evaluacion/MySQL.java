package PruebaP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MySQL {
	
	private final String URL = "jdbc:mysql://23.11.185.242/program1_avanada?useSSL=false";
	private final String USR = "program1_studiantes";
	private final String PSS = "estudiantesarrayanes";
	private Connection getConnection() throws SQLException {
	return DriverManager.getConnection(URL, USR, PSS);
	
	
}
	public void listar(DefaultTableModel modelo){
		
		
		String sentencia  = "SELECT  id , producto , precio FROM productos";
		
		try {
			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();
			
			while(rs.next()) {
				
				String ci = rs.getString(1);
				String producto = rs.getString(2);
				int precio = rs.getInt(3);
				
				Object[] fila = {ci, producto, precio};
				
				
				}
		
			
		}catch (Exception e ) { 
			
			
			
			JOptionPane.showMessageDialog(null, "Error" + e);
		}
	}
}