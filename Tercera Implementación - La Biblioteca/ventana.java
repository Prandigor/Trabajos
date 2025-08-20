package laura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {
	
	public ventana() {
		Libro[] libro = new Libro[10];
	this.setTitle("Registrar usuario"); 
	this.setSize(600,400); 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	this.setLocationRelativeTo(null);
	JPanel panel = new JPanel ();
	JButton registrar = new JButton("Registrar");
	JButton listar = new JButton("Listar");
	JTextField txisbn = new JTextField(5);
	JLabel isbn = new JLabel ("isbn: ");
	JTextField txautor = new JTextField(5);
	JLabel autor = new JLabel ("autor: ");
	JTextField txtitulo = new JTextField(5);
	JLabel titulo = new JLabel ("titulo: ");
	JLabel registrado = new JLabel ("registrado correctamente");
	registrado.setVisible(false);
	registrar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < libro.length; i++) {
			if (libro[i] == null ) {
			libro[i] = new Libro(txisbn.getText() ,txautor.getText() ,txtitulo.getText());
			registrado.setVisible(true);
			txisbn.setText(null);
			txautor.setText(null);
			txtitulo.setText(null);
			break;
			
			}
				
			}
			
		
		}
	}); 
	
	listar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < libro.length; i++) {
				if(libro[i] != null ) {
				
				System.out.println(libro[i] );
				registrado.setVisible(false);
			}
			
			}
			
		}
	});
	
	this.add(panel);
	
	panel.add(isbn);
	panel.add(txisbn);
	panel.add(autor);
	panel.add(txautor);
	panel.add(titulo);
	panel.add(txtitulo);
	panel.add(registrar);
	panel.add(registrado);
	panel.add(listar);
	}	
}
