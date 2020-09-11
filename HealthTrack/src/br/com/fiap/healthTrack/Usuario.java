package br.com.fiap.healthTrack;

/**
 * Classe Usuário
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */
public class Usuario {
	/**
	 *	CPF  
	 */
	String cpf;
	
	/**
	 *	Nome  
	 */
	String nome;
	
	/**
	 *	Status  
	 */
	String status;

	
	/**
	 *	Peso atual
	 */
	float pesoAtual;
	
	/**
	 *	Altura atual
	 */
	float alturaAtual;
	
	/**
	 *	Meta de peso
	 */
	float metaPeso;
	
	/**
	 *	Objetivo
	 */
	String objetivo;
	
	/**
	 *	Sexo 
	 */
	String sexo;
	
	/**
	 *	Url da imagem do perfil
	 */
	String urlImagemPerfil;
	
	public Usuario() {
		
	}
	
	public Usuario(String cpf, String nome, String Status, float pesoAtual, float alturaAtual, float metaPeso, String objetivo, String sexo, String urlImagemPerfil) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.setStatus(Status);
		this.setPesoAtual(pesoAtual);
		this.setAltura(alturaAtual);
		this.setMetaPeso(metaPeso);
		this.setObjetivo(objetivo);
		this.setSexo(sexo);
		this.setUrlImagemPerfil(urlImagemPerfil);
	}
	
	/**
	 * Inclui um novo usuário
	 */
	public void incluir() {
		// Lógica
	}
	
	/**
	 * Atualiza usuário
	 */
	public void atualizar() {
		// Lógica
	}
	
	/**
	 * Calcula quanto falta para atingir a meta de peso
	 */
	public String calculaPesoRestante() {
		float pesoAtual = this.getPesoAtual();
		float metaPeso = this.getMetaPeso();
		float diferenca = pesoAtual - metaPeso;
		String mensagem = "Faltam ".concat(Float.toString(diferenca)).concat("kg para atingir a sua meta.");
		
		return mensagem;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public float getPesoAtual() {
		return pesoAtual;
	}
	
	public void setPesoAtual(float pesoAtual) {
		this.pesoAtual = pesoAtual;
	}
	
	public float getAlturaAtual() {
		return alturaAtual;
	}
	
	public void setAltura(float alturaAtual) {
		this.alturaAtual = alturaAtual;
	}
	
	public float getMetaPeso() {
		return metaPeso;
	}
	
	public void setMetaPeso(float metaPeso) {
		this.metaPeso = metaPeso;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getUrlImagemPerfil() {
		return urlImagemPerfil;
	}
	
	public void setUrlImagemPerfil(String urlImagemPerfil) {
		this.urlImagemPerfil = urlImagemPerfil;
	}
}
