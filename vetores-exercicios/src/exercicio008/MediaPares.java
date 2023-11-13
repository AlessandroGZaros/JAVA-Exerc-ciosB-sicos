package exercicio008;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
		//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
		//digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
		int par = 0, soma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos havera no vetor ? ");
		int n = sc.nextInt();
				
		int[] numeros = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite o " + (i+1) + "o numero : ");
			numeros[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(numeros[i] % 2 == 0) {
				par++;
				soma+=numeros[i];
			}
		}
		if(par > 0) {
			int media = soma/par;
			 
			if(par > 1) {
				System.out.println("Foram digitados " + par + " numeros pares.");
				System.out.println("Media dos valores par : " + media);
			}
			else {
				System.out.println("Foi digitado somente um numero par.");
			}
		}
		else {
			System.out.println("NAO FORAM DIGITADOS NUMEROS PARES.");
		}
		
		
		
		
		
		sc.close();

	}

}
