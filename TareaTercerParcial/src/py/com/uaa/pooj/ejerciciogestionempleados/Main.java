
package py.com.uaa.pooj.ejerciciogestionempleados;

/**
 *
 * @author gsoria
 */
public class Main {


    public static void main(String[] args) {
        // TODO Prueben los metodos implementados!
    	Empleado empleado1 = new Empleado();
    	
    	empleado1.setDireccion("Jejui 548");
    	empleado1.setEdad(35);
    	empleado1.setNombre("Pedro");
    	
    	empleado1.setHoras_extras(2f);
    	empleado1.calcularSalario();
    	empleado1.setSalario_base(1500000f);
    	empleado1.pagarVacaciones(3);
    	
    	
    	System.out.println("El salario del empleado es:" + empleado1.calcularSalario());
    	System.out.println("El monto total por vacaciones es:" + empleado1.pagarVacaciones(3));
    	
    	
    }
    
}
