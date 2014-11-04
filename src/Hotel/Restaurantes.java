package Hotel;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurantes extends JFrame {
	private JPanel contentPane;

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurantes frame = new Restaurantes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame.
	public Restaurantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JComboBox comboBox = new JComboBox();
        String[] options = { "Mayan Place", "Mayan Nights", "Mayan Grill", "Italian Noodles", "Mediterranean Flavor" };
        comboBox = new JComboBox(options);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(52, 39, 160, 40);
		contentPane.add(comboBox);
		
		JButton btnReservarRestaurante = new JButton("Reservar Restaurante");
		btnReservarRestaurante.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		btnReservarRestaurante.setBounds(52, 146, 181, 33);
		contentPane.add(btnReservarRestaurante);
	}

}
