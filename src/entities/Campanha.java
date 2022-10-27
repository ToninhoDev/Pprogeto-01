package entities;

public class Campanha {
	
	private String dataInicial;
	private String dataFinal;
	private Double valor;
	private Double valorDaMeta;
	private String Descricao;
	private String pessoas;
	private String ong;
	
	
	public Campanha() {
		
	}


	public Campanha(String dataInicial, String dataFinal, Double valor, Double valorDaMeta, String descricao,
			String pessoas, String ong) {
		
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.valor = valor;
		this.valorDaMeta = valorDaMeta;
		Descricao = descricao;
		this.pessoas = pessoas;
		this.ong = ong;
	}


	public String getDataInicial() {
		return dataInicial;
	}


	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}


	public String getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Double getValorDaMeta() {
		return valorDaMeta;
	}


	public void setValorDaMeta(Double valorDaMeta) {
		this.valorDaMeta = valorDaMeta;
	}


	public String getDescricao() {
		return Descricao;
	}


	public void setDescricao(String descricao) {
		Descricao = descricao;
	}


	public String getPessoas() {
		return pessoas;
	}


	public void setPessoas(String pessoas) {
		this.pessoas = pessoas;
	}


	public String getOng() {
		return ong;
	}


	public void setOng(String ong) {
		this.ong = ong;
	}
	
	
	

}
