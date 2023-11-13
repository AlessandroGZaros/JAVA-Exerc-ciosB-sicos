package exercicio006;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		//o vetor C gerado.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros deseja digitar em cada vetor ?");
		int n = sc.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];
		int[] D = new int[n];
		
		for(int i = 0;i < n;i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0;i < n;i++) {
			B[i] = sc.nextInt();
		}
		
		for(int i = 0;i < n;i++) {
			D[i] = A[i] + B[i];
			System.out.println("["+i+"] - ["+ D[i]+"]");
		}
		sc.close();
		
	}

}
