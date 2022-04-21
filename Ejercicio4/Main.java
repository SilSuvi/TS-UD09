package UD09.Ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("�Quiere calcular la ra�z? Diga s� o no");

		String respuesta = scanner.nextLine();
		respuesta = respuesta.toLowerCase();
		if (respuesta.equals("si") || respuesta.equals("s�")) {

			do {
				System.out.println("Perfecto: indique el primero n�mero (N�mero A):");
				double numA = scanner.nextDouble();
				System.out.println("Ahora el segundo (N�mero B):");
				double numB = scanner.nextDouble();
				System.out.println("Ahora el tercero (N�mero C):");
				double numC = scanner.nextDouble();
				Raices raices = new Raices(numA, numB, numC);
				opciones(raices);
				System.out.println("Quiere volver a realizar otro c�lculo? Diga 'confirmar' si es que s�");
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
				"Indique opci�n : \n (1) Discriminante \n (2) Conocer si tiene soluci�n \n (3) Calcular soluci�n: ");
		int respuesta = scanner.nextInt();
		switch (respuesta) {
		case 1:
			System.out.println("Discriminante: " + raices.getDiscriminante());
			break;
		case 2:
			if (raices.getDiscriminante() == 0) {
				System.out.println("Tiene m�s de una soluci�n");
			} else {
				System.out.println("Tiene una soluci�n");
			}
			break;
		case 3:
			raices.calculate();
			break;
		default:
			System.out.println("Ingrese una opci�n v�lida");
			break;
		}

		scanner.close();
	}
}
