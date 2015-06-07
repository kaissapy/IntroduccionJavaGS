package py.com.uaa.pooj.SegundoParcial;

public class CuentaAhorro extends Cuenta {
	private float tasaInteres;

	public CuentaAhorro(Cliente Cliente,long nroCuenta, Integer saldo, float tasaInteres) {
		this.setCliente(Cliente);
		this.setNroCuenta(nroCuenta);
		this.setSaldo(saldo);
		this.setTasaInteres(tasaInteres);
	}

	
	private void setCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	private void setNroCuenta(long nroCuenta) {
		// TODO Auto-generated method stub
		
	}
	
	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}


	public float getTasaInteres() {
		return tasaInteres;
	}


	public void setTasaInteres(Integer tasaInteres) {
		this.tasaInteres = tasaInteres;
	}


	@Override
	public String debitar(Integer importe) {
		if (this.getSaldo()>importe) {
			this.setSaldo(this.getSaldo() - importe);
			return "APROBADA";
		}
		else {
			return "RECHAZADA";}
		}
		

	@Override
	public String acreditar(Integer importe) {
		// TODO Auto-generated method stub
			this.setSaldo(this.getSaldo() + importe);
			return "NUEVO SALDO";
		}
	

}
