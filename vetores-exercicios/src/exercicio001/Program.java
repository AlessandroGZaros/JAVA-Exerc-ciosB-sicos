package exercicio001;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 0 e 10 : ");
		int n = sc.nextInt();
		while(n > 10) {
			System.out.println("Digite novamente: ");
			n = sc.nextInt();
		}
		System.out.println("Digite os " + n + " valores :");
		int[] vect = new int[n];
		for(int i =  0;i < n;i++) {
			vect[i] = sc.nextInt();
		}
		for(int i =0;i < n;i++) {
			if(vect[i] < 0) {
				System.out.println("vect[" + i + "] =  " + vect[i]);	
			}
			
		}
		
		sc.close();
		
	}

}
