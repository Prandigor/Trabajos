package Ejercicioventana;
import javax.swing.*;
public class Miventana extends JFrame {
	public Miventana() {
		
		this.setTitle("Ventana de prueba - Ramiro Sosa"); 
		this.setSize(600,400); //tamaño en px,primero ancho y luego largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //accion default para cerrar
		this.setLocationRelativeTo(null); //posicion en la que inicia la ventana
		JPanel panel1 = new JPanel ();
		JLabel usuario1 = new JLabel ("Bienvenido a mi programa:");	
		JLabel usuario2 = new JLabel ("                                                                                                                             ");
		JLabel contraseña = new JLabel ("nombre: ");
		

		JTextField inp2 = new JTextField();     
		JLabel usuario3 = new JLabel ("                                                                                                                               ");
		JButton inicia = new JButton("aceptar");
		

		this.add(panel1);
		panel1.add(usuario1);
		panel1.add(usuario2);
		
		
		panel1.add(contraseña);
		panel1.add(inp2);
		panel1.add(usuario3);
		panel1.add(inicia);
		
		inp2.setColumns(10);
		
		
}
}
