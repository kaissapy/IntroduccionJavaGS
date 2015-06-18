
package py.com.uaa.pooj.ejerciciobolsa;

import java.util.ArrayList;

public class Main {
	
	

	public static void main(String[] args) {
		
		
		ArrayList<Elemento> elemento = new ArrayList<Elemento> ();
	
		elemento.add(5, null);
		elemento.add(11, null);
		
			
			
		BolsaElementos bolsa1 = new BolsaElementos(elemento);
		BolsaElementos bolsa2 = new BolsaElementos(elemento);
		bolsa1.esVacio();
		bolsa1.unirBolsas(bolsa1, bolsa2);
		System.out.println(bolsa1.esVacio());
		System.out.println(bolsa1);
		System.out.println(bolsa2);
		
		//bolsa1.agregarElemento(5);
		//bolsa1.contarPresenciaElemento(elemento);
		//bolsa1.eliminarElemento(elemento);
		//bolsa1.estaDentro(elemento);
		
	}
	
	
	//TODO probar todos los metodos de la clase BolsaElemento
	/*
	 * para eso se deben crear elementos
	 * crear bolsas
	 * agregar elementos a la bolsa
	 * eliminar elementos a la bolsa
	 * etc...
	 */
	
	

	
	
	

}
