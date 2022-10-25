package models.dao;

import java.util.Date;
import java.util.List;

import models.HotelModel;

import enums.EnumCancelarPacote;
import exceptions.TipoDePacoteErradoException;

public class PacoteDAO {

	public void cadastraPacoteMaritimo(Long IDUsuario, List<PassageiroModel> passageiros,
			EnderecoModel localEmbarque, EnderecoModel localDesembarque,
			Date dataPartida, Date dataRetorno) {
	}
	
	public void cadastraPacoteAereo(Long IDUsuario, List<PassageiroModel> passageiros,
			EnderecoModel localPartida, EnderecoModel localDestino,
			Date dataPartida, Date dataRetorno, HotelModel hotel, GuiaModel guia,
			List<PasseioModel> passeios) {
	}
	
	public EnumCancelarPacote cancelarPacote(Long IDPacote) {
		return null;
	}
	
	public String getURLRoteiroPDF(Long IDPacote) {
		return null;
	}
	
	public PacoteAereoModel getInformacoesPacoteAereo(Long IDPacote) throws TipoDePacoteErradoException {
		return null;
	}
	
	public PacoteMaritimoModel getInformacoesPacoteMaritimo(Long IDPacote) throws TipoDePacoteErradoException {
		return null;
	}
}
