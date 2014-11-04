package Hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.*;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Reservacion extends JFrame {
	protected static final String Pais = null;
	protected static final int Telefono = 0;
	protected static final String Nombre = null;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtPais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservacion frame = new Reservacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Reservacion() {
		addWindowListener(new WindowAdapter() {
			
			public void windowOpened(java.awt.event.WindowEvent evt) {
			diseno foto=new diseno();
			this.add( foto, BorderLayout.SOUTH);
			foto.repaint();
			}

			private void add(diseno foto, String south) {
				// TODO Auto-generated method stub
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNombre.setBounds(42, 40, 61, 16);
		contentPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblTelefono.setBounds(42, 67, 61, 16);
		contentPane.add(lblTelefono);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblPais.setBounds(42, 93, 61, 16);
		contentPane.add(lblPais);
		
		JLabel lblTipoDeHabitacin = new JLabel("Tipo de Habitaci\u00F3n:");
		lblTipoDeHabitacin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblTipoDeHabitacin.setBounds(42, 120, 119, 16);
		contentPane.add(lblTipoDeHabitacin);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
				public void keyTyped(KeyEvent evt) {
					char Nombre = evt.getKeyChar();
					if(Character.isDigit(Nombre)){
						evt.consume();
					}
			}
		});
		txtNombre.setBounds(113, 39, 181, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(113, 66, 129, 20);
		contentPane.add(txtTelefono);
		
		txtPais = new JTextField();
		txtPais.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
					char Pais = evt.getKeyChar();
					if(Character.isDigit(Pais)){
						evt.consume();
					}
			}
		});
		txtPais.setColumns(10);
		txtPais.setBounds(113, 92, 129, 20);
		contentPane.add(txtPais);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox.setBounds(181, 118, 61, 20);
		contentPane.add(comboBox);
		
		JButton buttonReservar = new JButton("Reservar");
		buttonReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtNombre.getText().equals("")){
					JOptionPane.showMessageDialog(null,  "Por favor ingrese el nombre");
					return;
				}
				if(txtTelefono.getText().equals("")){
					JOptionPane.showMessageDialog(null,  "Por favor ingrese telefono");
					return;
				}
				if(txtPais.getText().equals("")){
					JOptionPane.showMessageDialog(null,  "Por favor ingrese pais");
					return;
				}
				
				String Nombre,Pais;
				String Telefono;
				Nombre=txtNombre.getText();
				Telefono=txtTelefono.getText();
				Pais=txtPais.getText();
				
				
				Clientes clientes=new Clientes(Nombre, Telefono, Pais);
				Datos.GuardarClientes(clientes);
			}
		});
		buttonReservar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonReservar.setBounds(45, 191, 116, 45);
		contentPane.add(buttonReservar);
		
		JButton buttonPaquetes = new JButton("Paquetes");
		buttonPaquetes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonPaquetes.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonPaquetes.setBounds(178, 191, 116, 45);
		contentPane.add(buttonPaquetes);
		
		JButton buttonRestaurantes = new JButton("Restaurantes");
		buttonRestaurantes.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonRestaurantes.setBounds(316, 191, 116, 45);
		contentPane.add(buttonRestaurantes);
		
		JButton buttonSalir = new JButton("Salir");
		buttonSalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		buttonSalir.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonSalir.setBounds(316, 247, 116, 45);
		contentPane.add(buttonSalir);
		
		JButton buttonMostrar = new JButton("Mostrar");
		buttonMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				JOptionPane.showMessageDialog(null, Datos.MostrarDatos());
			}
		});
		buttonMostrar.setBounds(42, 260, 89, 23);
		contentPane.add(buttonMostrar);
		
		JButton buttonLimpiar = new JButton("Limpiar");
		buttonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			txtNombre.setText("");
			txtPais.setText("");
			txtTelefono.setText("");
			}
		});
		buttonLimpiar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonLimpiar.setBounds(178, 247, 116, 45);
		contentPane.add(buttonLimpiar);
	}
}
