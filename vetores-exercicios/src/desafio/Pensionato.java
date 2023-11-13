package desafio;

import java.util.Scanner;



public class Pensionato {

	public static void main(String[] args) {
		/* A dona de um pensionato possui dez quartos para alugar para estudantes,
		sendo esses quartos identificados pelos números 0 a 9.
		Fazer um programa que inicie com todos os dez quartos vazios, e depois
		leia uma quantidade N representando o número de estudantes que vão
		alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		N estudantes. Para cada registro de aluguel, informar o nome e email do
		estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		um relatório de todas ocupações do pensionato, por ordem de quarto,
		conforme exemplo.*/
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Quantos quartos serao alugados ?");
		int n = sc.nextInt();
		
		Alunos[] alunos = new Alunos[10];
		
		for(int i =0;i<n;i++) {
			System.out.println("Aluguel #"+ i);
			System.out.print("Nome do aluno: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("email : ");
			String ema = sc.next();
			System.out.println("Numero do Quarto: ");
			int qto = sc.nextInt();
			alunos[qto] = new Alunos(name,ema);
			
		}
		for(int i =0;i<10;i++) {
			if(alunos[i] != null) {
				System.out.println("Quarto " + i);
				System.out.println(alunos[i].toString());
				System.out.println("==================");
				System.out.println();
			}
		}
		
		
		sc.close();

	}

}
