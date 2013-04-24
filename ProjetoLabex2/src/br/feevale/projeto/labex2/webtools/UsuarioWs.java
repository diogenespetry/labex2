package br.feevale.projeto.labex2.webtools;

import br.feevale.projeto.labex2.pojo.Usuario;

public class UsuarioWs extends Webservice {

	/**
	 * Retorna o objeto do usu�rio caso sucesso
	 * caso contr�rio retorna null
	 * 
	 * @param userName
	 * @param senha
	 * @return objeto do usu�rio ou NULL
	 */
	public Usuario getSessao(String userName, String senha) {
		Usuario usuario = null;
		
		if(userName.equals("teste") && senha.equals("teste")) {
			usuario = new Usuario();
			usuario.id = 1;
			usuario.nome = "Jo�o do Teste";
			usuario.sessao = "RdH42d35hastews5Q3E";
		}
		
		return usuario;
		
	}
	
}
