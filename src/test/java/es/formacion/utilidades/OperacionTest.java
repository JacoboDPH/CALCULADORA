package es.formacion.utilidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.formacion.cip.modelo.Division;
import es.formacion.cip.modelo.Multiplicacion;
import es.formacion.cip.modelo.Resta;
import es.formacion.cip.modelo.Suma;
import junit.framework.Assert;

public class OperacionTest {

	
	@Test
	public void dividir() {
		
		Division division = new Division(8, 2);
		
		Assert.assertEquals(4, division.resultado, 0);
		
		division.imprimirResultado();
		
	}

	@Test
	public void multiplicacion() {
		
		Multiplicacion multiplicacion = new Multiplicacion(8, 8);
		
		Assert.assertEquals(64, multiplicacion.resultado, 0);
		
		multiplicacion.imprimirResultado();
		
	}
	@Test
	public void suma() {
		
		Suma suma = new Suma(5, 5);
		
		Assert.assertEquals(10, suma.resultado, 0);
		
		suma.imprimirResultado();
		
		
	}
	@Test
	public void resta() {
		
		Resta resta = new Resta(10, 5);
		
		Assert.assertEquals(5, resta.resultado, 0);
		
		resta.imprimirResultado();
	}

}
