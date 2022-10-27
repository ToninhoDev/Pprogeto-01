package entities;

public class Ong {
	
	private String name;
	private String cnpj;
	private Double conta;
	private int telefone;
	private char status;
	
	
	public Ong() {
		
	}


	public Ong(String name, String cnpj, Double conta, int telefone, char status) {
		this.name = name;
		this.cnpj = cnpj;
		this.conta = conta;
		this.telefone = telefone;
		this.status = status;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public Double getConta() {
		return conta;
	}


	public void setConta(Double conta) {
		this.conta = conta;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public char getStatus() {
		return status;
	}


	public void setStatus(char status) {
		this.status = status;
	}
	
	
	
	

}
