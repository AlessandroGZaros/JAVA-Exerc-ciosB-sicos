package exercicio002;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		//- Imprimir todos os elementos do vetor
		//- Mostrar na tela a soma e a média dos elementos do vetor
		Locale.setDefault(Locale.US);
		double soma = 0, media;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números deseja armazenar ? ");
		int n = sc.nextInt();
		
		
		double[] vect = new double[n];
		
		System.out.println();
		for(int i =0; i < n;i++) {
			vect[i] = sc.nextDouble();
		}
		for(int i = 0;i < n;i++) {
			System.out.println("[" + i +  "] = "+ vect[i]);
			soma += vect[i];
		}
		media = soma/n;
		System.out.printf("Soma dos valores : %.2f%n" ,soma);
		System.out.printf("Media dos valores : %.2f%n" , media);
	
		
		sc.close();
	}
	

}
