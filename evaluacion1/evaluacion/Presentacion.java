package PruebaP;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Presentacion extends JFrame {

Gestor logica = new Gestor();	
		
		public Presentacion(){
			
		
		this.setTitle("Mauro");
		this.setSize(800, 600);
		this.setResizable(false);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    JButton asion = new JButton("boton");
	    
		JPanel panel = new JPanel();
		
		
		String[] columnas = {"id" , "producto ", "precio"};
		
		
		DefaultTableModel modelo = new DefaultTableModel(null, columnas);
		JTable tabla = new JTable (modelo);
		JScrollPane Scroll = new JScrollPane(tabla);
		
		asion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				logica.listar(modelo);
			}
		});
		
		this.add(panel);
		
		panel.add(Scroll);
		panel.add(asion);
		
		}
		

}
			
			
			
			
			
			
			
		
		
		
		
		
		
		
	