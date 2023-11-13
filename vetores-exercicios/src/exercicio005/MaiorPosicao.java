package exercicio005;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		//considerando a primeira posição como 0 (zero). 

		Scanner sc = new Scanner(System.in);
		double maior = 0.0;
		int ind = 0;
		
		System.out.print("Quantos numeros reais deseja digitar ? ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for(int i =0;i < n;i++) {
			numeros[i] = sc.nextDouble();
		}
		for(int i = 0;i < n;i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
				ind = i;
			}
		}
		System.out.println("Maior numero digitado : " + maior);
		System.out.println("Na posicao [" + ind + "]");
		
		sc.close();
	}

}
