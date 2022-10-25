package models;

import java.util.Date;
import java.util.List;

import enums.EnumCancelarPacote;

import models.dao.PacoteDAO;

@SuppressWarnings("unused")
public class PacoteModel extends AbstractModelBase {
	
	private Long IDPacote;
	private UsuarioModel usuarioProprietario;
	private List<PassageiroModel> passageiros;
	private EnderecoModel localPartida;
	private EnderecoModel localDestino;
	private Date dataPartida;
	private Date dataVolta;
	private String URLRoteiroPDF;

	private PacoteDAO dao;

	public void cadastrarPacote() {
		
	}
	
	public EnumCancelarPacote cancelarPacote(Long IDPacote) {
		return null;
	}
	
}
