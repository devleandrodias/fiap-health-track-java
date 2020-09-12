package br.com.fiap.healthTrack.teste;

import br.com.fiap.healthTrack.Assinatura;
import br.com.fiap.healthTrack.Usuario;

public class Teste {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Assinatura assinatura = new Assinatura();
		
		assinatura.setTipoAssinatura("Premium");
		assinatura.setDescricao("Assinatura Premium Health Track");
		assinatura.setValorUnitarioAssinatura(59.90f);
		
		usuario.setCpf("111.111.111-11");
		usuario.setNome("João Silva");
		usuario.setStatus("ativo");
		usuario.setPesoAtual(72.5f);
		usuario.setAltura(1.73f);
		usuario.setMetaPeso(65.0f);
		usuario.setObjetivo("Quero emagrecer antes do casamento do meu primo");
		usuario.setSexo("masculino");
		usuario.setUrlImagemPerfil("foto_joao.png");
		usuario.setAssinatura(assinatura);
		
		System.out.println(usuario.calculaPesoRestante());
		usuario.getAssinatura().cancelarAssinatura();
		
		
	}
}
