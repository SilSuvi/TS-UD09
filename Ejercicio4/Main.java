package UD09.Ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Quiere calcular la raíz? Diga sí o no");

		String respuesta = scanner.nextLine();
		respuesta = respuesta.toLowerCase();
		if (respuesta.equals("si") || respuesta.equals("sí")) {

			do {
				System.out.println("Perfecto: indique el primero número (Número A):");
				double numA = scanner.nextDouble();
				System.out.println("Ahora el segundo (Número B):");
				double numB = scanner.nextDouble();
				System.out.println("Ahora el tercero (Número C):");
				double numC = scanner.nextDouble();
				Raices raices = new Raices(numA, numB, numC);
				opciones(raices);
				System.out.println("Quiere volver a realizar otro cálculo? Diga 'confirmar' si es que sí");
				Scanner scanner2 = new Scanner(System.in);
				respuesta = scanner2.nextLine();

			} while (respuesta.equals("confirmar"));
		} else {
			System.out.println("Hasta otra");
		}

		scanner.close();
	}

	public static void opciones(Raices raices) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Indique opción : \n (1) Discriminante \n (2) Conocer si tiene solución \n (3) Calcular solución: ");
		int respuesta = scanner.nextInt();
		switch (respuesta) {
		case 1:
			System.out.println("Discriminante: " + raices.getDiscriminante());
			break;
		case 2:
			if (raices.getDiscriminante() == 0) {
				System.out.println("Tiene más de una solución");
			} else {
				System.out.println("Tiene una solución");
			}
			break;
		case 3:
			raices.calculate();
			break;
		default:
			System.out.println("Ingrese una opción válida");
			break;
		}

		scanner.close();
	}
}
