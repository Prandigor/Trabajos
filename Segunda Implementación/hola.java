package hola;




import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;


public class hola extends JFrame {
	

	

	public hola() {

		JPanel panel1 = new JPanel();

		this.setTitle("Todo bien profe?");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		
		JTextField primernum = new JTextField(5);
		JTextField segundonum = new JTextField(5);
		JLabel laNombre = new JLabel("Primer numero: ");
		JLabel laApellido = new JLabel("Segundo numero: ");
		JLabel espacio = new JLabel("                                                                                                                                                                                           ");
		JLabel espacio2 = new JLabel("                                                                                                                                                                                           ");

	
		

		JButton sumar = new JButton("+");
		
		
		
		
		
		
	sumar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int primernumS = Integer.parseInt(primernum.getText()) ;
			
			int segundonumS = Integer.parseInt(segundonum.getText()) ;
			
		JLabel resultsuma = new JLabel("la suma dio: " + (primernumS + segundonumS));
			panel1.add(resultsuma);
			panel1.revalidate();
			panel1.repaint();
			}
	});

		

	// RESTA
		JButton restar = new JButton("-");
			
		restar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			int primernumR = Integer.parseInt(primernum.getText()) ;
			int segundonumR = Integer.parseInt(segundonum.getText()) ;
		JLabel resultresta = new JLabel("la resta da: " + (primernumR - segundonumR));
			
			panel1.add(resultresta);
			panel1.revalidate();
			panel1.repaint();
			
			}
	});

		JButton multiplicar = new JButton("x");
		
	multiplicar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int primernumM  = Integer.parseInt(primernum.getText()) ;
			int segundonumM = Integer.parseInt(segundonum.getText()) ; 
				JLabel resultmulti = new JLabel("la multiplicacion da: " + (primernumM * segundonumM));
			
			panel1.add(resultmulti);
			panel1.revalidate();
			panel1.repaint();
		}
});

				

			
		
	JButton divison = new JButton("/");
	divison.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int primernum2 = Integer.parseInt(primernum.getText()) ;
			int segundonum2 = Integer.parseInt(segundonum.getText()) ;
				JLabel resultivi = new JLabel("Resultado Division: "+(primernum2 / segundonum2));
			panel1.add(resultivi);
			panel1.revalidate();
			panel1.repaint();
	}
});
		

			
				
			

			
			

		

		this.add(panel1);
		panel1.add(laNombre);
		panel1.add(primernum);		
		panel1.add(espacio);
		panel1.add(laApellido);
		panel1.add(segundonum);
		panel1.add(espacio2);
		panel1.add(sumar);
		panel1.add(restar);
		panel1.add(multiplicar);
		panel1.add(divison);
		panel1.add(espacio);

		
	}

	
		
	}
