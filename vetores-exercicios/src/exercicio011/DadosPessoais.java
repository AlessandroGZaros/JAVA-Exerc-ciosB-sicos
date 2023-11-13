package exercicio011;

import java.util.Scanner;

public class DadosPessoais {

	public static void main(String[] args) {
		// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
		//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
		//de homens. 
		Scanner sc = new Scanner(System.in);
		double maiorAltura = 0,menorAltura = 0,somaAlturaMulheres = 0;
		int qtdHomens = 0, cont = 0;
		
		
		System.out.print("Quandade depessoas a serem cadastradas : ");
		int n = sc.nextInt();
		
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Altura da " + (i+1) +"a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.println("Genero da " + (i+1) +"a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		for(int i=0;i<n;i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if(genero[i] == 'M') {
				qtdHomens++;
			}
			if(genero[i] == 'F') {
				somaAlturaMulheres+= altura[i];
				cont++;
			}
		}
		for(int i=0;i<n;i++) {
			if(i == 0) {
				menorAltura = altura[i];
			}
			else {
				if(altura[i] < menorAltura) {
					menorAltura= altura[i];
				}
			}
		}
		double media = somaAlturaMulheres/cont;
		
		System.out.printf("Maior Altura %.2f%n ", maiorAltura);
		System.out.printf("Menor Altura %.2f%n ", menorAltura);
		System.out.println("Quantidade de homens : " + qtdHomens);
		System.out.printf("Media das altura das mulheres %.2f" , media);
		
		
		
		sc.close();

	}

}
