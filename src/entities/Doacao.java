package entities;

public class Doacao {
	
	private String beneficiario;
	private Double valor;
	private String formaDePagamentoString;
	
	public Doacao() {
		
	}

	public Doacao(String beneficiario, Double valor, String formaDePagamentoString) {
		
		this.beneficiario = beneficiario;
		this.valor = valor;
		this.formaDePagamentoString = formaDePagamentoString;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFormaDePagamentoString() {
		return formaDePagamentoString;
	}

	public void setFormaDePagamentoString(String formaDePagamentoString) {
		this.formaDePagamentoString = formaDePagamentoString;
	}
	
	
	

}
