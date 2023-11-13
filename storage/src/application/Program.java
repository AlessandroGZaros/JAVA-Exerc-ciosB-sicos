package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter new product data : ");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product Data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be add in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.printf("Update Data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be remove from stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.printf("Update Data: " + product);
		
		sc.close();

	}

}
