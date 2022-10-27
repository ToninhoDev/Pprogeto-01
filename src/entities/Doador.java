package entities;

public class Doador {

	private String listaDeDoacao;
	private String dataCadastro;
	private String situacao;
	
	
	public Doador() {
		
	}


	public Doador(String listaDeDoacao, String dataCadastro, String situacao) {
		
		this.listaDeDoacao = listaDeDoacao;
		this.dataCadastro = dataCadastro;
		this.situacao = situacao;
	}


	public String getListaDeDoacao() {
		return listaDeDoacao;
	}


	public void setListaDeDoacao(String listaDeDoacao) {
		this.listaDeDoacao = listaDeDoacao;
	}


	public String getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	
}
