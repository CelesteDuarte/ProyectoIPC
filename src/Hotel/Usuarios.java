package Hotel;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios extends JFrame {
	private JPanel contentPane;
	
	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios frame = new Usuarios();
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
	public Usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonRegresar = new JButton("Regresar");
		buttonRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Instancias el nuevo frame
				Inicio v1 = new Inicio();
				// lo haces visible
				v1.setVisible(true);
			}
		});
		buttonRegresar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonRegresar.setBounds(269, 194, 89, 23);
		contentPane.add(buttonRegresar);
		
		JButton buttonCancelar = new JButton("Cancelar Reservacion");
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		buttonCancelar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		buttonCancelar.setBounds(44, 193, 167, 25);
		contentPane.add(buttonCancelar);
		
		List list = new List();
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		list.setBounds(29, 10, 354, 153);
		contentPane.add(list);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(383, 10, 17, 153);
		contentPane.add(scrollbar);
	}
}
