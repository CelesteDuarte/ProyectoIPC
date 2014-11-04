package Hotel;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

public class Inicio extends JFrame {
	public JFrame frmVentana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.frmVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame.
	public Inicio() {
		frmVentana = new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentana.setTitle("Inicio");
		setBounds(100, 100, 520, 360);
		frmVentana = new JFrame();
		frmVentana.getContentPane().setLayout(null);
		
		JButton buttonReservaciones = new JButton("Reservaciones");
		buttonReservaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Instancias el nuevo frame
				Reservacion v2 = new Reservacion();
				// lo haces visible
				v2.setVisible(true);

			}
		
		});
		
		buttonReservaciones.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonReservaciones.setBounds(53, 154, 116, 40);
		frmVentana.getContentPane().add(buttonReservaciones);
		
		JButton buttonControl = new JButton("Control de Usuarios");
		buttonControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Instancias el nuevo frame
				Usuarios v2 = new Usuarios();
				// lo haces visible
				v2.setVisible(true);

			}
		});
		buttonControl.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonControl.setBounds(179, 154, 167, 40);
		frmVentana.getContentPane().add(buttonControl);
		
		JButton button_1 = new JButton("Reservaciones");
		button_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		button_1.setBounds(356, 154, 116, 40);
		frmVentana.getContentPane().add(button_1);
		
		JLabel lblBienvenidoAHoteles = new JLabel("Bienvenido a Hoteles de Centro America");
		lblBienvenidoAHoteles.setForeground(Color.BLUE);
		lblBienvenidoAHoteles.setBackground(Color.WHITE);
		lblBienvenidoAHoteles.setFont(new Font("Footlight MT Light", Font.BOLD, 21));
		lblBienvenidoAHoteles.setBounds(64, 33, 390, 50);
		frmVentana.getContentPane().add(lblBienvenidoAHoteles);
		}
	

	}
