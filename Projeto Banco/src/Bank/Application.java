package Bank;

import java.util.Scanner;

import Entities.ContaCorrente;
import Entities.ContaEmpresa;
import Entities.ContaEspecial;
import Entities.ContaEstudantil;
import Entities.ContaPoupanca;

public class Application {
	
//Wesley Menezes, Geisiele Luzia Deda, Julio Batista
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int conta, resposta;
		String cpf;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("===============================");
			System.out.println("||                             ||");
			System.out.println("||       Banco Nirvana G6      || ");
			System.out.println("||   Seu paraiso financeiro    ||");
			System.out.println("||                             ||");
			System.out.println("===============================");
			System.out.println();
			System.out.println("Que tipo de conta deseja acessar: ");
			System.out.println();
			System.out.println("1 - CONTA POUPANÇA");
			System.out.println("2 - CONTA CORRENTE");
			System.out.println("3 - CONTA ESPECIAL");
			System.out.println("4 - CONTA EMPRESA");
			System.out.println("5 - CONTA ESTUDANTIL");
			System.out.println("6 - SAIR");
			
			resposta = sc.nextInt();
			
			switch (resposta) {
			case 1:
				ContaPoupanca.exibirMenu();
				break;
				
			case 2:
				System.out.println("Digite o número da conta: ");
				conta = sc.nextInt();
				System.out.println("===============================");
				
				System.out.println("Digite o CPF: ");
				cpf = sc.nextLine();
				sc.nextLine();
				ContaCorrente corrente = new ContaCorrente(conta, cpf);
				break;
				
			case 3:
				System.out.println("Digite o número da conta: ");
				conta = sc.nextInt();
				System.out.println("===============================");
				
				System.out.println("Digite o CPF: ");
				cpf = sc.nextLine();
				sc.nextLine();
				ContaEspecial especial = new ContaEspecial(conta, cpf);
				break;
			case 4:
				System.out.println("Digite o número da conta: ");
				conta = sc.nextInt();
				System.out.println("===============================");
				
				System.out.println("Digite o CPF: ");
				cpf = sc.nextLine();
				sc.nextLine();
				ContaEmpresa empresa = new ContaEmpresa(conta, cpf);
				break;
			case 5:
				
				System.out.println("Digite o número da conta: ");
				conta = sc.nextInt();
				System.out.println("===============================");
				
				System.out.println("Digite o CPF: ");
				cpf = sc.nextLine();
				sc.nextLine();
				ContaEstudantil estudente = new ContaEstudantil(conta, cpf);
				break;
			case 6:
				System.out.println();
				System.out.println("Obrigado por utilizar o banco Nirvana. :D ");
				sc.close();
				break;
			default:
				System.out.println("Opção não válida.");
				break;
			}
		}while(resposta != 6);

	}

}
