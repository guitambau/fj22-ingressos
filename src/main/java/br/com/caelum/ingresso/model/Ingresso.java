package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.caelum.ingresso.desconto.Desconto;

public class Ingresso {
	
	private Sessao sessao;
	private BigDecimal preco;
	
	/**
	 * @deprecated hybernate only
	 */

	public Ingresso(){
		
	}
	
	public Ingresso(Sessao sessao,Desconto tipoDesconto) {
		this.setSessao(sessao);
		this.preco = tipoDesconto.aplicarDescontoSobre(sessao.getPreco());
		
	}
	
	public BigDecimal getPreco() {
		return preco.setScale(2, RoundingMode.HALF_UP);
	}
	
	public void setPreco(BigDecimal preco){
		this.preco = preco;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

}


