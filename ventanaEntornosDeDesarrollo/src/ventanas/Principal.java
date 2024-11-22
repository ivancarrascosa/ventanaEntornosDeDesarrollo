package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.TextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextArea txtrNombre;
	private JTextField textField;
	private JTextArea txtrContrasea;
	private JTextField textField_1;
	private JTextArea txtrIdioma;
	private Choice choice;
	private JTextArea txtrComunicacin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea("NUEVO USUARIO");
		textArea.setFont(new Font("Arial Black", Font.BOLD, 16));
		textArea.setBackground(SystemColor.menu);
		textArea.setBounds(134, 11, 171, 22);
		frame.getContentPane().add(textArea);
		
		txtrNombre = new JTextArea();
		txtrNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrNombre.setText("Nombre:");
		txtrNombre.setBackground(SystemColor.menu);
		txtrNombre.setBounds(107, 44, 61, 22);
		frame.getContentPane().add(txtrNombre);
		
		textField = new JTextField();
		textField.setBounds(234, 44, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtrContrasea = new JTextArea();
		txtrContrasea.setText("Contraseña:");
		txtrContrasea.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrContrasea.setBackground(SystemColor.menu);
		txtrContrasea.setBounds(107, 77, 86, 22);
		frame.getContentPane().add(txtrContrasea);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(234, 75, 86, 20);
		frame.getContentPane().add(textField_1);
		
		txtrIdioma = new JTextArea();
		txtrIdioma.setText("Idioma:");
		txtrIdioma.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrIdioma.setBackground(SystemColor.menu);
		txtrIdioma.setBounds(107, 110, 86, 22);
		frame.getContentPane().add(txtrIdioma);
		
		choice = new Choice();
		choice.setBounds(234, 112, 86, 20);
		frame.getContentPane().add(choice);
		
		txtrComunicacin = new JTextArea();
		txtrComunicacin.setText("Comunicación:");
		txtrComunicacin.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrComunicacin.setBackground(SystemColor.menu);
		txtrComunicacin.setBounds(107, 143, 106, 22);
		frame.getContentPane().add(txtrComunicacin);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teléfono");
		rdbtnNewRadioButton.setBounds(234, 143, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnEmail = new JRadioButton("e-mail");
		rdbtnEmail.setBounds(234, 169, 109, 23);
		frame.getContentPane().add(rdbtnEmail);
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(200, 216, 94, 23);
		frame.getContentPane().add(btnNewButton);
		choice.add("Español");
		choice.add("Francés");
		choice.add("Inglés");
	}
}
