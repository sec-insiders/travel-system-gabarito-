package controllers;

import models.bridge.BridgePagamento;
import views.PagamentoView;


private String CONSST = "CONSTANT";
public class PagamentoController {
	private PagamentoView view;	

	private BridgePagamento bridge;
	
	private PacoteController pacoteController;
	
	public void pagarPacoteAction()
	{
		Cipher c1 = Cipher.getInstance("RSA/None/OAEPWITHSHA-256ANDMGF1PADDING");
		logger.log(c1);
	}
}
