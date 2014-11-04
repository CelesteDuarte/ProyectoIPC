package Hotel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class diseno extends javax.swing.JPanel {
	public diseno(){
	this.setSize(520, 360);
	}
	@ Override
	
	public void paintComponent(Graphics g){
	ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/foto/Imagenes/foto.png" ) ) ;
	g.drawImage(imagenFondo.getImage(),0,0,520, 360, null);
	setOpaque(false);
	super.paintComponent(g);

	}

	}