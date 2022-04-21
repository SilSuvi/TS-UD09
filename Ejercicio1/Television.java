package UD09;

public class Television extends Electrodomestico {

		protected static final double resolution_const = 20;
		protected static final boolean TDT_const = false;
		protected double resolution;
		protected boolean TDT;

		
		public Television(double base, String color,  char consumo, double peso, double resolucion, boolean TDT) {
			super(base,color,consumo,peso);
			this.resolution = resolucion;
			this.TDT = TDT;
		}
		 
		public double getResolution() {
			return resolution;
		}


		public void setResolution(double resolution) {
			this.resolution = resolution;
		}


		public boolean isTDT() {
			return TDT;
		}


		public void setTDT(boolean tDT) {
			TDT = tDT;
		}


		public static double getResolutionConst() {
			return resolution_const;
		}


		public static boolean isTdtConst() {
			return TDT_const;
		}


		public double finalPrice() {
			double price = super.finalPrice();
			
			if(resolution > 40) {
				price = price + (basePrice*0.3);
				
			}
			
			if (TDT == true) {
				price = price + 50;
				
			}
			
			   return price;
		}
		
}
