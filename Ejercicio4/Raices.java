package UD09.Ejercicio4;

public class Raices {

	private double numA;
	private double numB;
	private double numC;

	public Raices(double numA, double numB, double numC) {
		this.numA = numA;
		this.numB = numB;
		this.numC = numC;
	}

	// OBTENCI�N DISCRIMINANTE
	public double getDiscriminante() {
		double discriminante = (Math.pow(this.numB, 2) - (4 * this.numA * this.numC));
		return discriminante;
	}

	// M�TODO QUE EVALUA SI ES MAYOR O IGUAL A "0", TIENE RAICES
	public boolean tieneRaices() {
		boolean haveRoots = false;
		if (getDiscriminante() >= 0) {
			haveRoots = true;
		}
		return haveRoots;
	}

	// M�TODO QUE DEVUELVE SI HAY UNA �NICA SOLUCI�N
	public boolean tieneRaiz() {
		boolean haveRoot = false;

		if (getDiscriminante() == 0) {
			haveRoot = true;
		}

		return haveRoot;
	}

	// M�TODOS PARA OBTENER RA�CES
	public String obtenerRaices() {

		double solution1 = ((-this.numB) + Math.sqrt(Math.pow(this.numB, 2) - (4 * this.numA * this.numC)))
				/ (2 * this.numA);
		double solution2 = ((-this.numB) - Math.sqrt(Math.pow(this.numB, 2) - (4 * this.numA * this.numC)))
				/ (2 * this.numA);
		return "Las posibles soluciones son : \nSolucion 1 = " + solution1 + "\nSolucion 2 = " + solution2;

	}

	public String obtenerRaiz() {
		double solucion = ((-this.numB) - (4 * this.numA * this.numC)) / (2 * this.numA);
		return "La  solucion  es : \nSolucion = " + solucion;

	}

	// M�TODO CALCULAR
	public void calculate() {

		if (tieneRaiz()) {
			System.out.println("Tiene una soluci�n y es = \n" + obtenerRaiz());
		} else if (tieneRaices()) {
			System.out.println("Tiene m�s de una soluci�n = \n" + obtenerRaices());
		} else {
			System.out.println("no tiene soluci�");
		}
	}

}
