package entities;

public class CurrencyConverter {
	public static double dollarPrice;
	public static int quantity;
	
	public static final double IOF = 0.06; 
	
	public static double Amount() {
		return dollarPrice*quantity + dollarPrice*quantity*IOF;
	}
}
