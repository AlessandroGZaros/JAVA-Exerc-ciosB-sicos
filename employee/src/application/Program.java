package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.next();
		System.out.println("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name);
		System.out.printf("Gross salary: $%.2f%n", employee.GrossSalary);
		System.out.printf("Tax: $%.2f%n%n", employee.tax);
		
		System.out.println("Witch percentage to increase salary ?");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println("Upadate Data : " + employee);
		
		sc.close();
	}
}
