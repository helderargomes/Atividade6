package model.entities;

public abstract class Conta {
	private String nome;
	private String cpf;
	private Integer agencia;
	private Integer conta;
	private Integer digitoConta;
	
	public Conta() {
		
	}

	public Conta(String nome, String cpf, Integer agencia, Integer conta, Integer digitoConta) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta = conta;
		this.digitoConta = digitoConta;
	}
	
	
	

}
