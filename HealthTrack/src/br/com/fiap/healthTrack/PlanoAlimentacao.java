package br.com.fiap.healthTrack;

/**
 * Classe PlanoAlimentacao
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */

import java.util.Date;
import java.util.List;

public class PlanoAlimentacao {
	/** 
	 * DataRefeicao 
	 */
	Date dataRefeicao;
	

	/** 
	 * QuantidadeIngerida 
	 */
	int quantidadeIngerida;
	

	public PlanoAlimentacao() {
		
	}


	public PlanoAlimentacao(int quantidadeIngerida, Date dataRefeicao) {
		this.setQuantidadeIngerida(quantidadeIngerida)
		this.setDataRefeicao(dataRefeicao)
	}

	/**
	 * Retorna a lista de alimentos
	 */
	public List<Alimento> obterAlimentosRealizado() {
		// Lógica
		return null;
	}
	
	/**
	 * Inclui um alimento na lista de alimentos
	 */
	public void realizarNovaAlimentacao(Alimento aliemento, int quantidadeIngerida, Date dataRefeicao) {
		// Lógica
	}

	public Date getDataRefeicao() {
		return dataRefeicao;
	}
	
	public void setDataRefeicao(Date dataRefeicao) {
		this.dataRefeicao = dataRefeicao;
	}
	

	public int getQuantidadeIngerida() {
		return quantidadeIngerida;
	}
	
	public void setQuantidadeIngerida(int quantidadeIngerida) {
		this.quantidadeIngerida = quantidadeIngerida;
	}
}
