package models;

import java.util.List;

@SuppressWarnings("unused")
public class HotelModel extends AbstractModelBase {
	
	private Long IDHotel;
	private List<String> imagensDoHotel;
	private EnderecoModel endereco;
	private int estrelas;
	private String descricao;
	
}
