package UD09;

public class Lavadora extends Electrodomestico {

		private final static int load_const = 5;
		private int load;

		public Lavadora(double base, String color, char consumo, double peso, int carga) {
			super(base, color, consumo, peso);
			this.load = carga;

		}

		public int getLoad() {
			return load;
		}


		public void setLoad(int load) {
			this.load = load;
		}


		public static int getLoadConst() {
			return load_const;
		}


		public double finalPrice() {
			double price = super.finalPrice();

			if (load > 30) {
				price += 50;
			}

			return price;
		}


}
