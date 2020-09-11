package br.com.fiap.healthTrack;

/**
 * Classe Endereco
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */
public class Endereco {
	/** 
	 * CEP 
	 */
	String cep;

	/** 
	 * Complemento 
	 */
	String complemento;

	/** 
	 * Estado 
	 */
	String estado;

	/** 
	 * TipoLogradouro 
	 */
	String tipoLogradouro;

	/** 
	 * TipoEndereco 
	 */
	String tipoEndereco;

	/** 
	 * Bairro 
	 */
	String bairro;
	
	/** 
	 * Cidade 
	 */
	String cidade;
	
	/** 
	 * Logradouro 
	 */
	String logradouro;
	
	public Endereco() {
		
	}

	public Endereco(String cep, String tipoLogradouro, String logradouro, String bairro, String cidade, String estado, String tipoEndereco, String complemento) {
		this.setComplemento(complemento);
		this.setEstado(estado);
		this.setTipoLogradouro(tipoLogradouro);
		this.setTipoEndereco(tipoEndereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setLogradouro(logradouro);
	}


	
	public void incluir() {
		// Lógica
	}
	
	public void atualizar() {
		// Lógica
	}

	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	

	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	

	public String getTipoEndereco() {
		return tipoEndereco;
	}
	
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	

	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	

	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	

	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	

}
