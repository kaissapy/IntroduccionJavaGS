package py.com.uaa.pooj.segundoparcial;

public class CuentaAhorro extends Cuenta {

	//atributo
	private float tasaInteres;
	
	//metodos solicitados por el ejercicio
	@Override
	public String debitar(Integer importe) {
		if(this.getSaldo()>importe){
			this.setSaldo(this.getSaldo()-importe);
			return "APROBADA";
		}else{
			return "RECHAZADA";
		}
	}

	@Override
	public String acreditar(Integer importe) {
		this.setSaldo(this.getSaldo()+importe);
		String mensaje = new String();
		mensaje = "Nuevo saldo: " + this.getSaldo();
		return mensaje;
		
	}

	/**
	 * 
	 * @param cliente es el cliente due�o de la cuenta
	 * @param nroCuenta es el numero asignado por informatica
	 * @param saldo es el deposito inicial que realiza el cliente
	 * @param tasaInteres es el porcetaje a ser cobrado por el prestamo
	 */
	CuentaAhorro(Cliente cliente, Integer nroCuenta, Integer saldo, float tasaInteres){
		this.setCliente(cliente);
		try {
			this.setNroCuenta(nroCuenta);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		this.setSaldo(saldo);
		this.setTasaInteres(tasaInteres);
		
	}
	
	
	//getters y setters
	public float getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	
}
