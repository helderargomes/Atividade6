package model.entities;

import model.exceptions.DomainException;

public class Investimento extends Conta {
	private Double saldo = 0.00;
	private Double limite = 0.00;
	
	
	public Investimento() {
		
	}
	
	

	public Investimento(String nome, String cpf, Integer agencia, Integer conta, Integer digitoConta) {
		super(nome, cpf, agencia, conta, digitoConta);
	}
	

	public Double getSaldo() {
		return saldo;
	}



	public Double getLimite() {
		return limite;
	}



	
	public void deposito(double valor) {
		this.saldo += valor;
		this.saldo += saldo*0.01;
		this.limite = saldo * 2;
		
		
	}


	public void saque(double valor) throws DomainException {
		if((valor > this.saldo)&&(valor>this.limite)) {
			throw new DomainException ("Saldo insuficiente");
		}
		if(valor > this.limite) {
			throw new DomainException ("Limite insuficiente");
		}
		this.saldo -= valor;
		if(saldo < 0) {
			this.limite = 0.00;
		}
		else {
			this.limite = saldo*2;
		}
	}

}
