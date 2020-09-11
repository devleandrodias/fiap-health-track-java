package br.com.fiap.healthTrack;

/**
 * Classe Login
 * @author Leandro Dias
 * @author Daniel Caires
 * @version 1.0
 */
public class Login {
	/** 
	 * Username 
	 */
	String username;
	

	/** 
	 * Email 
	 */
	String email;
	

	/** 
	 * SenhaHash 
	 */
	String senhaHash;
	

	public Login() {
		
	}


	public Login(String username, String email, String senhaHash) {
		this.setUsername(username);
		this.setEmail(email);
		this.setSenhaHash(senhaHash);
	}
	
	/**
	 * Compara o email e senha e retorna true se o usuário conseguir fazer login
	 */
	public boolean logar(String email, String senha) {
		// Lógica
		return true;
	}
	
	/**
	 * Troca a senha
	 */
	public void trocarSenha(String senhaAntiga, String novaSenha) {
		// Lógica
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getSenhaHash() {
		return senhaHash;
	}
	
	public void setSenhaHash(String senhaHash) {
		this.senhaHash = senhaHash;
	}
}
