package py.com.uaa.pooj.SegundoParcial;

public abstract class Cuenta {
	
	private Cliente nombre;
	private Cliente apellido;
	private Cliente nroCedula;
	private Cliente direccion;
	private Cliente telefono;
	private long nroCuenta;
	private Integer saldo;
	
	//Constructor
	public Cuenta(Cliente Cliente, long nroCuenta, Integer saldo) {
		this.setCliente(Cliente);
		this.setNroCuenta(nroCuenta);
		this.setSaldo(saldo);
	}
	
	public Cuenta(){
		
	}
	
	private void setNroCuenta(long nroCuenta) {
		// TODO Auto-generated method stub
		
	}

	private void setCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	//Metodo abstracto
		public abstract String debitar(Integer importe);
		
		public abstract String acreditar(Integer importe);
		



	public Integer getSaldo() {
		return saldo;
	}


	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}



}
