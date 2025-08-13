package hola;




import java.awt.event.*;
import javax.swing.*;


public class hola extends JFrame {
	

	public hola() {

		JPanel panel1 = new JPanel();

		this.setTitle("Todo bien profe?");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JTextField txtfNombre = new JTextField();
		JTextField txtfApellido = new JTextField();
		

		JLabel laNombre = new JLabel("Nombre ");
		JLabel laApellido = new JLabel("Apellido ");
		JLabel espacio = new JLabel("                                                                                                                                                                                           ");
		JLabel espacio2 = new JLabel("                                                                                                                                                                                           ");

		JButton PINGO = new JButton("Almacenar");
		

		

		

	

		PINGO.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String aNombre = txtfNombre.getText();
				System.out.println(aNombre);
				

				

			}
		});

		

			
				
			

			
			

		

		this.add(panel1);
		panel1.add(laNombre);
		panel1.add(txtfNombre);
		panel1.add(espacio);
		panel1.add(laApellido);
		panel1.add(txtfApellido);
		panel1.add(espacio2);
		panel1.add(PINGO);
		

		txtfNombre.setColumns(5);
		txtfApellido.setColumns(10);

		
	}

	
		
	}
