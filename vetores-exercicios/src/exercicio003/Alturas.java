package exercicio003;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		//bem como os nomes dessas pessoas caso houver. 
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
			
		double soma = 0;
		int menor = 0;
		System.out.print("Quantas pessoas deseja cadastrar ? ");
		int n = sc.nextInt();
		String[] nome = new String[n] ;
		int[] idade = new int[n];
		double[] alt = new double[n];
		
		for(int i = 0;i < n;i++) {
			System.out.println("===========================");
			System.out.println("Dados da " + (i+1) + "pessoa : ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("ALtura: ");
			alt[i] = sc.nextDouble();
			
		}
				
		for(int i=0;i <n;i++) {
			if( idade[i] < 16 ) {
				System.out.printf("[%d]Nome : %s  Idade : %d%n ",i,nome[i],idade[i] );
				menor++;
			}
			soma += alt[i];
					
		}
		
		double percent =  menor * 100.0 / n;
		System.out.printf("ALtura media : %.2f%n ",(soma/n));
		System.out.printf("Porcentagem das pessoas menores de 16 anos : %.1f%%%n ",percent);
		
		sc.close();
	}

}
