package Hotel;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Datos {
	private static final String Telefono = null;
	private static final String Nombre = null;
	private static final String Pais = null;
	private static final String Tipocama = null;
	static Vector<Clientes> vector = new Vector<Clientes>();
	static Clientes clientes = new Clientes(Nombre, Telefono, Pais, Tipocama);

	public static void GuardarClientes(Clientes clientes){
		if(vector.add(clientes)){
			JOptionPane.showMessageDialog(null,  "Se ha agregado correctamente");
		}
	}
	
	public static String MostrarDatos(){
		String Linea = "", Linea2;
		for(int x=0;x<vector.size();x++){
			clientes=(Clientes)vector.get(x);
			Linea2=clientes.getNombre()+ " - "+clientes.getTelefono()+" - "+clientes.getPais()+" - "+clientes.getTipocama();

		Linea=Linea+Linea2+"\n";
		}
	return Linea;
	}
	
}
