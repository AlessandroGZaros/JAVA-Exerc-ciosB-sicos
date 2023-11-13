package exercicio010;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
		//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
		//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
		//igual a 6.0 (seis). 

		Scanner sc = new Scanner(System.in);
		double media;
		
		System.out.print("Quantidade de Alunos a serem cadastrados: ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Dados cadastrais " + (i+1)+ "o aluno:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Primeira nota : ");
			nota1[i] = sc.nextDouble();
			System.out.println("Segunda nota : ");
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos Aprovados:");
		for(int i=0;i<n;i++) {
			media = (nota1[i] + nota2[i])/2;
			if(media >= 6.0 ) {
				System.out.println("Aluno " + nomes[i] + " Media: " + media);
			}
		}
		
		
		sc.close();

	}

}
