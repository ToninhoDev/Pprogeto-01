package entities;

public class Pessoas {
	
	private String nome;
	private String documento;
	private String tipo;
	private String telefone;
	
	
	public Pessoas() {


	}


	public Pessoas(String nome, String documento, String tipo, String telefone) {
		
		this.nome = nome;
		this.documento = documento;
		this.tipo = tipo;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
