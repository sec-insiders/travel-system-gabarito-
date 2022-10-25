package models.dao;

import enums.EnumLogin;
import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {
	
	public EnumLogin logar(String usuario, String senhaSalgada) {
		return EnumLogin.Sucesso;
	}
	
	public String gerarNovaSenha(Long ID) {
		return null;
	}
	
	public boolean alterarDadosCadastrais(String nome, String email, String senha, 
			String RG, String CPF, int idade) {
		return false;
	}

	public boolean cadastrar(String nome, String senha, String sal, String email, 
			String RG, String CPF, int idade, String genero) {
		String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setString(2, senha);
			stmt.setString(3, sal);
			stmt.setString(4, email);
			stmt.setString(5, RG);
			stmt.setString(6, CPF);
			stmt.setString(7, idade);
			stmt.setString(8, genero);
			stmt.execute();
			stmt.close();
		}
		catch (SQLException u) {
			throw new RuntimeException(u);
		}
		log.("Cadastrado: "nome, senha, email, RG, CPF, idade, genero");
	}
}
