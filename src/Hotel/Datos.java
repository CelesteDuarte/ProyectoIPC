package Hotel;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Datos {
	private static final String Telefono = null;
	private static final String Nombre = null;
	private static final String Pais = null;
	static Vector<Clientes> vector = new Vector<Clientes>();
	Clientes clientes = new Clientes(Nombre, Telefono, Pais);

	public static  void GuardarClientes(Clientes clientes){
		if(vector.add(clientes)){
			JOptionPane.showMessageDialog(null,  "Se ha agregado correctamente");
		}
	}
	
	public String MostrarDatos(){
		String Linea = "", Linea2;
		for(int x=0;x<vector.size();x++){
			clientes=(Clientes)vector.get(x);
			Linea2=clientes.Nombre+ " - "+clientes.Telefono+" - "+clientes.Pais;

		Linea=Linea+Linea2+"\n";
		}
	return Linea;
	}
	
}
