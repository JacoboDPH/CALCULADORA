package es.formacion.cip.modelo;

import es.formacion.cip.utilidades.Operacion;

public class Resta extends Operacion {

	private double resta = 0;
	
	public Resta(double numero1, double numero2) {
		
		super(numero1, numero2, '-');
		this.resta = numero1 - numero2;
		this.setResultado(this.resta);
	}
}
