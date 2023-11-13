/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

package app;

import java.util.Scanner;

import entities.Cliente;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		
		
		System.out.println("Digite o numero da Conta: ");
		int numero = sc.nextInt();
		System.out.println("Digite o nome do titular da conta : ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Deseja fazer um depósito inicial ? (s/n) ");
		char resp = sc.next().charAt(0);
		if(resp == 's') {
			System.out.println("Valor do depósito : ");
			double depositoInicial = sc.nextDouble();
			cliente = new Cliente(numero, nome, depositoInicial);
		}else {
			cliente = new Cliente(numero,nome);
		}
		System.out.println("Dados da Conta ");
		System.out.println();
		System.out.println(cliente.toString());
		
		System.out.println("********************************");
		
		System.out.println("Digite o valor do deposito : R$ ");
		cliente.deposito(sc.nextDouble());
		System.out.println(cliente.toString());
		
		System.out.println("********************************");
		
		System.out.println("Digite o valor do saque : R$ ");
		cliente.saque(sc.nextDouble());
		System.out.println(cliente.toString());
		
		
		sc.close();
		
		

	}

}
