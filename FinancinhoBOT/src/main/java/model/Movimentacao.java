package model;

import java.time.LocalDate;

public class Movimentacao {
	private String movimentacao;
	private String locaoPessoa;
	private String pagamento;
	private String status;
	private LocalDate dataMovimentacao;
	private double valor;
	
	public Movimentacao() {
		super();	
	}

	public String getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
	}

	public String getLocaoPessoa() {
		return locaoPessoa;
	}

	public void setLocaoPessoa(String locaoPessoa) {
		this.locaoPessoa = locaoPessoa;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status.toUpperCase();
	}

	public LocalDate getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(LocalDate dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
