package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Corrente;
import model.entities.Investimento;
import model.exceptions.DomainException;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		try {	
			System.out.println("Digite os dados do cliente:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("CPF: ");
			String cpf = sc.nextLine();
			System.out.print("Digite o numero da agencia (sem o digito): ");
			int agencia = sc.nextInt();
			System.out.print("Digite o numero da conta (sem o digito): ");
			int conta = sc.nextInt();
			System.out.println("Digite o digito da conta: ");
			int digito = sc.nextInt();
			
			Corrente corrente = new Corrente(nome, cpf, agencia, conta, digito);
	
			System.out.println("Digite os dados da conta investimento: ");
			System.out.print("Número da conta Investimento (sem o digito): ");
			int contaInv = sc.nextInt();
			System.out.println("Dígito da conta Investimento: ");
			int digitoInv = sc.nextInt();
			Investimento investimento = new Investimento(nome, cpf, agencia, contaInv, digitoInv);
			
			
			System.out.print("Digite o valor para depósito na conta corrente:");
			double valor = sc.nextDouble();
			corrente.deposito(valor);
			System.out.println("Novo saldo: " + corrente.getSaldo());
			
			System.out.print("Digite o valor para depósito na conta investimento:");
			double valorInv = sc.nextDouble();
			investimento.deposito(valorInv);
			System.out.println("Novo saldo: " + investimento.getSaldo());
			System.out.println("Novo limite de saque-especial: " + investimento.getLimite());
			
			System.out.println("Digite o valor de saque da conta corrente: ");
			double saque = sc.nextDouble();
			corrente.saque(saque);
			System.out.println("Novo saldo: " + corrente.getSaldo());
			
			System.out.println("Digite o valor de saque da conta investimento: ");
			double saqueInv = sc.nextDouble();
			investimento.saque(saqueInv);
			System.out.println("Novo saldo: " + investimento.getSaldo());
			System.out.println("Novo limite de saque-especial: " + investimento.getLimite());
			}
		catch (DomainException x) {
			System.out.println("Erro: " + x.getMessage());
		}	
		sc.close();
	}
	

}
