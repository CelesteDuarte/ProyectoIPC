package Hotel;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class dise�o extends javax.swing.JPanel {
	public dise�o(){
	this.setSize(520, 360);
	}
	@ Override
	
	public void paintComponent(Graphics g){
	ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/dise�o/Imagenes/dise�o.png" ) ) ;
	g.drawImage(imagenFondo.getImage(),0,0,520, 360, null);
	setOpaque(false);
	super.paintComponent(g);

	}

	}