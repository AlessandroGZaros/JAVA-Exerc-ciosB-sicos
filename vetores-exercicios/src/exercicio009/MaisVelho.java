package exercicio009;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		// Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
		//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
		//da pessoa mais velha
		
		Scanner sc = new Scanner(System.in);
		
		int maisVelho = 0;
		int ind = 0;
		
		System.out.print("Quantas pessoas serao cadastradas ? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(idades[i] > maisVelho) {
				maisVelho = idades[i];
				ind = i;
			}
		}
		System.out.println("Pessoa mais velha e " + nomes[ind]+ " com " + maisVelho + " anos.");
		
		
		
		sc.close();
	}

}
