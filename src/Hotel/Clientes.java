package Hotel;
public class Clientes {

	private String Nombre;
	private String Telefono;
	private String Pais;
	private String Tipocama;

	//Constructor por parametros
	public Clientes(String Nombre, String Telefono, String Pais, String Tipocama){
		this.setNombre(Nombre);
		this.setTelefono(Telefono);
		this.setPais(Pais);
		this.setTipocama(Tipocama);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getTipocama() {
		return Tipocama;
	}

	public void setTipocama(String tipocama) {
		Tipocama = tipocama;
	}
}