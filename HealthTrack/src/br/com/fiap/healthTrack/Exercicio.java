package br.com.fiap.healthTrack;

/**
 * Classe Exercicio
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */
public class Exercicio {
	/** 
	 * TempoDuracaoMinutos 
	 */
	int tempoDuracaoMinutos;
	

	/** 
	 * GastoCalorico 
	 */
	float gastoCalorico;
	

	/** 
	 * Descricao 
	 */
	String descricao;
	

	/** 
	 * Nome 
	 */
	String nome;
	

	public Exercicio() {
		
	}


	public Exercicio(String nome, String descricao, int tempoDuracaoMinutos, float gastoCalorico) {
		this.setTempoDuracaoMinutos(tempoDuracaoMinutos);
		this.setGastoCalorico(gastoCalorico);
		this.setDescricao(descricao);
		this.setNome(nome);
	}

	/**
	 * Adiciona um novo exercicio
	 */
	public void incluir() {
		// Lógica
	}
	
	/**
	 * Adiciona o exercicio
	 */
	public void atualizar() {
		// Lógica
	}

	public int getTempoDuracaoMinutos() {
		return tempoDuracaoMinutos;
	}
	
	public void setTempoDuracaoMinutos(int tempoDuracaoMinutos) {
		this.tempoDuracaoMinutos = tempoDuracaoMinutos;
	}
	

	public float getGastoCalorico() {
		return gastoCalorico;
	}
	
	public void setGastoCalorico(float gastoCalorico) {
		this.gastoCalorico = gastoCalorico;
	}
	

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
