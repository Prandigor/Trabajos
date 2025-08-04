package Ejercicioventana;
import java.awt.GridLayout;

import javax.swing.*;
public class Miventana extends JFrame {
public Miventana() {
	
	
	this.setTitle("Registrar usuario"); 
	this.setSize(600,400); //tamaño en px,primero ancho y luego largo
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //accion default para cerrar
	this.setLocationRelativeTo(null); //posicion en la que inicia la ventana
	JPanel panel1 = new JPanel ();
	JLabel usuario1 = new JLabel ("Nombre: ");
	JTextField inp1 = new JTextField();
	JLabel usuario2 = new JLabel ("Apellido: ");
	JTextField inp2 = new JTextField();
	JLabel usuario3 = new JLabel ("Cedula: ");
	JTextField inp3 = new JTextField();
	JLabel usuario4 = new JLabel ("Edad: ");
	JTextField inp4 = new JTextField();
	JLabel contraseña = new JLabel ("Contraseña: ");
	JTextField inp = new JTextField();
	JLabel espacio = new JLabel (" ");
	JButton inicia = new JButton("Registrar");
	JLabel inp5 = new JLabel ("rol: ");
	JComboBox rol = new JComboBox ();
	JTextField rol1 = new JTextField();
	this.add(panel1);
	panel1.add(usuario1);
	panel1.add(inp1);
	panel1.add(contraseña);
	panel1.add(inp2);
	
	panel1.add(usuario3);
	panel1.add(inp3);
	panel1.add(usuario4);
	panel1.add(inp4);
	panel1.add(inp5);
	panel1.add(rol);
	panel1.add(espacio);
	panel1.add(inicia);
	inp1.setColumns(5);
	inp2.setColumns(10);
	 panel1.setLayout(new GridLayout(10,10));
}  
}
