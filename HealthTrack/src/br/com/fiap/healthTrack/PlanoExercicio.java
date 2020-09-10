package br.com.fiap.healthTrack;

import java.util.Date;
import java.util.List;

/**
 * Classe Plano de Exercício
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */
public class PlanoExercicio {
	/**
	 * Duracao minutos
	 * */
	int duracaoMinutos;
	
	/*
	 * Data realizacao exercicíos
	 * */
	Date dataRelizacaoExercicio;
	
	public PlanoExercicio() {
		
	}
	
	public PlanoExercicio(int duracaoMinutos, Date dataRealizacaoExercicio) {
		this.setDuracaoMinutos(duracaoMinutos);
		this.setDataRealizacaoExercicio(dataRealizacaoExercicio);
	}
	
	/*
	 * Obter todos os planos de exercício do usuário
	 * */
	public List<Exercicio> obterExerciciosRelizados() {
		// Lógica
		return null;
	}
	
	/*
	 * Realiza um novo exercício e adiciona ao plano de exercício do usuário
	 * */
	public void realizarExercicio(Exercicio exercicio, int duracao, Date dataRealizada) {
		// Lógica
	}
	
	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}
	
	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	
	public Date getDataRealizacaoExercicio() {
		return dataRelizacaoExercicio;
	}
	
	public void setDataRealizacaoExercicio(Date dataRealizacaoExercicio) {
		this.dataRelizacaoExercicio = dataRealizacaoExercicio;
	}
}
