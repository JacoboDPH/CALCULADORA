package es.formacion.cip.modelo;

import es.formacion.cip.utilidades.Operacion;

public class Suma extends Operacion {

	private double suma = 0;
	
	public Suma(double numero1, double numero2) {
		
		super(numero1, numero2, '+');
		this.suma = numero1 + numero2;
		this.setResultado(this.suma);
	}
}
