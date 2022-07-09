package model.entities;

import model.exceptions.DomainException;

public class Corrente extends Conta {
	private double saldo;
	
	public Corrente() {
		
	}
	
	public Corrente(String nome, String cpf, Integer agencia, Integer conta, Integer digitoConta) {
		super(nome, cpf, agencia, conta, digitoConta);
	}

	
	public double getSaldo() {
		return saldo;
	}


	public void deposito(double valor) {
		this.saldo += valor;
		
		
	}


	public void saque(Double valor) throws DomainException {
		if(valor > this.saldo) {
			throw new DomainException ("Saldo insuficiente");
		}
		this.saldo -= valor;
		
	}

}
