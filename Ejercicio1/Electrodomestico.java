package UD09;

public class Electrodomestico {

	private final static double basePrice_const = 100;
	private final static String color_const = "white";
	private final static char consumption_const = 'F';
	private final static double weight_const = 5;
	protected double basePrice;
	protected String color;
	protected char consumption;
	protected double weight;

	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.basePrice = precio;
		this.color = color;
		this.consumption = consumo;
		this.weight = peso;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumption() {
		return consumption;
	}

	public void setConsumption(char consumption) {
		this.consumption = consumption;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static double getBasepriceConst() {
		return basePrice_const;
	}

	public static String getColorConst() {
		return color_const;
	}

	public static char getConsumptionConst() {
		return consumption_const;
	}

	public static double getWeightConst() {
		return weight_const;
	}

	public double finalPrice() {
		double price = 0;

		if (consumption == 'A') {
			price = price + 100;
		} else if (consumption == 'B') {
			price = price + 80;
		} else if (consumption == 'C') {
			price = price + 60;
		} else if (consumption == 'D') {
			price = price + 50;
		} else if (consumption == 'E') {
			price = price + 30;
		} else if (consumption == 'F') {
			price = price + 10;
		}

		if (weight >= 0 && weight < 19) {
			price = price +  10;
		} else if (weight >= 20 && weight < 49) {
			price = price + 50;
		} else if (weight >= 50 && weight <= 79) {
			price = price +  80;
		} else if (weight >= 80) {
			price = price + 100;
		}

		return basePrice + price;
	}

}
	
	