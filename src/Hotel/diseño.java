package Hotel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class diseño extends javax.swing.JPanel {
	public diseño(){
	this.setSize(520, 360);
	}
	@ Override
	
	public void paintComponent(Graphics g){
	ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/diseño/Imagenes/diseño.png" ) ) ;
	g.drawImage(imagenFondo.getImage(),0,0,520, 360, null);
	setOpaque(false);
	super.paintComponent(g);

	}

	}