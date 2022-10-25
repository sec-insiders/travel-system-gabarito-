package models;

import models.dao.UsuarioDAO;
import enums.EnumLogin;

@SuppressWarnings("unused")
public class UsuarioModel extends PassageiroModel {
	
	private Long idUsuario;
	private String senha;
	private String sal;
	private String email;
	private UsuarioDAO dao;
	
	public EnumLogin logar(String usuario, String senhaSalgada) {
		return null;
	}
	
	private String salgarSenha(String senha, String sal) {
		return null;
	}
	
	public boolean alterarDadosCadastrais() {
		return false;
	}
	
	public boolean gerarNovaSenha() {
		return false;
	}
	
	public boolean cadastrar() {
		return false;
	}
	
}
