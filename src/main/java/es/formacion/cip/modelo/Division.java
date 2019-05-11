package es.formacion.cip.modelo;

import es.formacion.cip.utilidades.Operacion;

public class Division extends Operacion {
	
	private double division = 0;
	
	public Division(double numero1, double numero2) {
		
		super(numero1, numero2, '/');
		
		if (numero2 == 0) System.out.println("No se puede dividir entre cero");
		else this.division = numero1 / numero2;
		this.setResultado(this.division);
	}

}
