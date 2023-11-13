package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price ?");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought ?");
		CurrencyConverter.quantity = sc.nextInt();
				
		System.out.println("Dollar Price: $ " + CurrencyConverter.dollarPrice);
		System.out.println("Quantity: " + CurrencyConverter.quantity);
		System.out.printf("Amount to be paid in R$ %.2f", CurrencyConverter.Amount());
		
		sc.close();
	}

}
