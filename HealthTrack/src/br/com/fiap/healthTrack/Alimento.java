package br.com.fiap.healthTrack;

/**
 * Classe Alimento
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */
public class Alimento {
	/** 
	 * Nome 
	 */
	String nome;
	
	/** 
	 * Unidade de medida
	 */
	String unidade;
	
	/** 
	 * KCalAlimento
	 */
	float kCalAlimento;
	
	/** 
	 * Categoria 
	 */
	String categoria;
	
	public Alimento() {
		
	}
	
	public Alimento(String nome, String unidade, float kCalAlimento, String categoria) {
		this.setNome(nome);
		this.setUnidade(unidade);
		this.setKCalAlimento(kCalAlimento);
		this.setCaregoria(categoria);
	}
	
	/**
	 * Adiciona um novo alimento
	 */
	public void incluir() {
		// Lógica
	}
	
	/**
	 * Atualiza um alimento existente
	 * */
	public void atualizar() {
		// Lógica
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidade() {
		return unidade;
	}
	
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	public float getKCalAlimento() {
		return kCalAlimento;
	}
	
	public void setKCalAlimento(float kCalAlimento) {
		this.kCalAlimento = kCalAlimento;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCaregoria(String categoria) {
		this.categoria = categoria;
	}
}
