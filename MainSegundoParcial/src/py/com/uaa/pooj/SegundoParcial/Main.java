package py.com.uaa.pooj.SegundoParcial;


public class Main {


	public static void main(String[] args) {
		
		Cliente cli= new Cliente("Gabriela", "Vargas", 4657845, "TteSolis", 12345);



		CuentaAhorro cuentaA= new CuentaAhorro(cli,new Long (123456789L),1000000,  0.10f);
		String resultado1= cuentaA.debitar(new Integer("10000"));
		System.out.println(resultado1);
		
		CuentaAhorro cuentaA2= new CuentaAhorro(cli,new Long (123456789), 100,  0.10f);
		String resultado2= cuentaA2.debitar(new Integer("150000"));
		System.out.println(resultado2);
		
		CuentaAhorro cuentaA3= new CuentaAhorro(cli, new Long(123456789),5000000,  0.10f);
		String resultado3 = cuentaA3.acreditar(new Integer("10000"));
		System.out.println(resultado3 + " " + cuentaA3.getSaldo());
		
		
		

	}
	

}
