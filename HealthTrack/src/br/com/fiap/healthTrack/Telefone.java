package br.com.fiap.healthTrack;

/**
 * Classe Telefone
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */
public class Telefone {
	/** 
	 * Ddi 
	 */
	int ddi;

	/** 
	 * Ddd 
	 */
	int ddd;
	
	/** 
	 * Tipo de Contato 
	 */
	String tipoContato;
	
	/** 
	 * Prefixo 
	 */
	int prefixo;
	
	/** 
	 * Sufixo 
	 */
	int sufixo;
	
	public Telefone() {
		
	}

	public Telefone(int ddi, int ddd, String tipoContato, int prefixo, int sufixo) {
		this.setDdi(ddi);
		this.setTipoContato(tipoContato);
		this.setPrefixo(prefixo);
		this.setSufixo(sufixo);
		this.setDdd(ddd);
	}
	
	/**
	 * Adiciona um novo telefone
	 */
	public void incluir() {
		// Lógica
	}
	
	/**
	 * Adiciona um telefone
	 */
	public void atualizar() {
		// Lógica
	}

	public int getDdi() {
		return ddi;
	}
	
	public void setDdi(int ddi) {
		this.ddi = ddi;
	}
	

	public String getTipoContato() {
		return tipoContato;
	}
	
	public void setTipoContato(String tipoContato) {
		this.tipoContato = tipoContato;
	}
	

	public int getPrefixo() {
		return prefixo;
	}
	
	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}
	

	public int getSufixo() {
		return sufixo;
	}
	
	public void setSufixo(int sufixo) {
		this.sufixo = sufixo;
	}
	

	public int getDdd() {
		return ddd;
	}
	
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
}
