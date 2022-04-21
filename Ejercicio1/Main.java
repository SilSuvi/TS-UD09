package UD09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double priceElectrodomestico = 0;
		double priceLavadora = 0;
		double priceTV = 0;
		Electrodomestico result[] = new Electrodomestico[5];

		result[0] = new Electrodomestico(299, "blue", 'C', 25); 
		result[1] = new Lavadora(155, "white", 'A', 30, 20);
		result[2] = new Television(599, "negro", 'F', 20, 24, false);
		result[3] = new Electrodomestico(499, "grey", 'B', 41);
		result[4] = new Electrodomestico(149, "pink", 'B', 12);
		
		for (int i = 0; i < result.length; i++) {
			if (result[i] instanceof Electrodomestico) {
				priceElectrodomestico = priceElectrodomestico + result[i].finalPrice();
			}
			if (result[i] instanceof Lavadora) {
				priceLavadora = priceLavadora + result[i].finalPrice();
			}

			if (result[i] instanceof Television) {
				priceTV = priceTV + result[i].finalPrice();
			}
		}

		double totalSum = priceElectrodomestico + priceLavadora + priceTV;
		
		System.out.println("Electrodomésticos, precio final: " + priceElectrodomestico);
		System.out.println("Televisiones, precio final: " + priceTV);
		System.out.println("Lavadoras, precio final: " + priceLavadora);
		System.out.println("La suma total es de: " + totalSum);

	}
}
