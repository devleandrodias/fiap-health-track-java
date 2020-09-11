package br.com.fiap.healthTrack;

/**
 * Classe Assinatura
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */

import java.util.Date;

public class Assinatura {
	/** 
	 * TipoAssinatura 
	 */
	String tipoAssinatura;	

	/** 
	 * DataInicio 
	 */
	Date dataInicio;

	/** 
	 * DataEncerramento 
	 */
	Date dataEncerramento;

	/** 
	 * Descricao 
	 */
	String descricao;

	/** 
	 * ValorUnitarioAssinatura 
	 */
	float valorUnitarioAssinatura;

	public Assinatura() {
		
	}

	public Assinatura(String tipoAssinatura, Date dataInicio, Date dataEncerramento, String descricao, float valorUnitarioAssinatura) {
		this.setTipoAssinatura(tipoAssinatura)
		this.setDataInicio(dataInicio)
		this.setDataEncerramento(dataEncerramento)
		this.setDescricao(descricao)
		this.setValorUnitarioAssinatura(valorUnitarioAssinatura)
	}
	
	/**
	 * Inclui uma nova assinatura
	 */
	public void realizaAssinatura() {
		// Lógica
	}
	
	/**
	 * Cancela uma assinatura
	 */
	public void cancelarAssinatura() {
		// Lógica	
	}
	
	/**
	 * Renova uma assinatura
	 */
	public void renovarAssinatura() {
		// Lógica
	}

	public String getTipoAssinatura() {
		return tipoAssinatura;
	}
	
	public void setTipoAssinatura(String tipoAssinatura) {
		this.tipoAssinatura = tipoAssinatura;
	}
	

	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	

	public Date getDataEncerramento() {
		return dataEncerramento;
	}
	
	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	public float getValorUnitarioAssinatura() {
		return valorUnitarioAssinatura;
	}
	
	public void setValorUnitarioAssinatura(float valorUnitarioAssinatura) {
		this.valorUnitarioAssinatura = valorUnitarioAssinatura;
	}
}
