package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Name : ");
		student.name = sc.next();
		System.out.println("Enter value quarter 1"); 
		student.grade1 = sc.nextDouble();
		System.out.println("Enter value quarter 2");
		student.grade2 = sc.nextDouble();
		System.out.println("Enter value quarter 3");
		student.grade3 = sc.nextDouble();
		
		System.out.println("Aluno: " + );
		student.finalGrade();
		System.out.println("FINAL GRADE " + student.finalGrade());
		if(student.finalGrade() > 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f", student.missing()); 
			
		}
		sc.close();
		
	}

}
