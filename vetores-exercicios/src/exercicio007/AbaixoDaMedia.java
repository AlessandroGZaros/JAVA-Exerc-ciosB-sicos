package exercicio007;

import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
		//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
		//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		System.out.println("Quantos elementos haverá no vetor ?");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for(int i = -0;i < n ; i++) {
			numeros[i] = sc.nextDouble();
			soma+=numeros[i];
		}
		double media = soma/n;
		System.out.printf("A média dos valores e : %.3f %n", media);
		System.out.println("Elementos abaixo da media:");
		for(int i =0; i < n; i++) {
			if(numeros[i] < media) {
				System.out.println(numeros[i]);
			}
		}
		
		
		
		sc.close();
	}

}
