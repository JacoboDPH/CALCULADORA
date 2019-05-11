package es.formacion.cip.utilidades;

public class Operacion {
	
	public double numero1;
	public double numero2;
	public double resultado;
	public char operacion;
	/**
	 * Este método recoge los valores que imprimiran el resultado
	 * @param numero1
	 * @param numero2
	 * @param operacion
	 */
	public Operacion (double numero1, double numero2, char operacion ) {
		
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operacion = operacion;
		
	}
	/**
	 * Este método imprimirá el resultado
	 */
	public void imprimirResultado() {
		
		System.out.println(this.numero1+" "+this.operacion+" "+this.numero2+" = "+this.resultado);
		
	}

	public double getNumero1() {
		return numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public double getResultado() {
		return resultado;
	}

	public char getOperacion() {
		return operacion;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	

}
