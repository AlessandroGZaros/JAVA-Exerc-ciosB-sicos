package exercicio004;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		//tela todos os números pares, e também a quantidade de números pares. 

		Scanner sc = new Scanner(System.in);
		int par = 0;
		System.out.print("Quantos numeros quer digitar ? ");
		int n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for(int i = 0;i < n; i++) {
			numeros[i] = sc.nextInt();
			
		}
		for(int i = 0;i < n;i++) {
			if((numeros[i] % 2) == 0) {
				System.out.println(numeros[i]);
				par++;
			}
		}
		if(par == 1) {
			System.out.println("Somente um numero e PAR.");
		}
		else if(par > 1){
			System.out.println(par + " numeros sao PARES.");
		}
		else {
			System.out.println("Nenhum numero e PAR.");
		}
		
		
		
		
		
		
		
		sc.close();
		
	}

}
