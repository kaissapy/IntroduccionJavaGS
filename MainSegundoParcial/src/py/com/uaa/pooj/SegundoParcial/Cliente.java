package py.com.uaa.pooj.SegundoParcial;

public class Cliente {
	private String nombre;
	private String apellido;
	private int nroCedula;
	private String direccion;
	private int numeroTelefono;
	

	public Cliente(String nombre, String apellido, int nroCedula, String direcion, int numeroTelefono) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setNroCedula(nroCedula);
		this.setDireccion(direccion);
		this.setNumeroTelefono(numeroTelefono);
		
	}
	
	public Cliente(){
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getNroCedula() {
		return nroCedula;
	}


	public void setNroCedula(int nroCedula) {
		this.nroCedula = nroCedula;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getNumeroTelefono() {
		return numeroTelefono;
	}


	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	
}
