package es.formacion.cip.modelo;

import es.formacion.cip.utilidades.Operacion;

public class Multiplicacion extends Operacion {
	
	private double multiplicacion = 0;
	
	public Multiplicacion(double numero1, double numero2) {
		
		super(numero1, numero2, '*');
		
		this.multiplicacion = numero1 * numero2;
		this.setResultado(this.multiplicacion);
	}

}
