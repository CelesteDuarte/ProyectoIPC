package Hotel;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class CustomListModel extends AbstractListModel{
	
	private ArrayList<Clientes> lista = new ArrayList<>(); 
	
    public int getSize() {
    	    return lista.size();
    }
 
  public Object getElementAt(int index) {
    	   Clientes p = lista.get(index);
    	   return p.getNombre();
    }
 
    public void addPersona(Clientes p){
    	  lista.add(p);
    	  this.fireIntervalAdded(this, getSize(), getSize()+1);
    	}
    
    public void eliminarPersona(int index0){
    	   lista.remove(index0);
    	   this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    	}
    
    public Clientes getClientes(int index){
    	  return lista.get(index);
    	}
}