package br.com.fiap.healthTrack;

import java.util.Date;

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
	 *	Data nascimento
	 */
	Date dataNascimento;
	
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
	
	public Usuario(String cpf, String nome, String Status, Date dataNascimento, float pesoAtual, float alturaAtual, float metaPeso, String objetivo, String sexo, String urlImagemPerfil) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.setStatus(Status);
		this.setDataNascimento(dataNascimento);
		this.setPesoAtual(pesoAtual);
		this.setAltura(alturaAtual);
		this.setMetaPeso(metaPeso);
		this.setObjetivo(objetivo);
		this.setSexo(sexo);
		this.setUrlImagemPerfil(urlImagemPerfil);
	}
	
	public void incluir() {
		// Lógica
	}
	
	public void atualizar() {
		// Lógica
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
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
