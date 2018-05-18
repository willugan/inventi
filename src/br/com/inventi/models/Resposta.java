package br.com.inventi.models;

/*
 * Classe responsável pelo objeto resposta e seus devidos tratamentos.
 * */

public class Resposta {
	private int codigoResposta;
	private String resposta;
	
	public Resposta() {
		
	}
	
	public Resposta(int pCodigoResposta, String pResposta) {
		setCodigoResposta(pCodigoResposta);
		setResposta(pResposta);
	}
	
	public String getAll() {
		return "Codigo da Resposta: " + codigoResposta + "\n" +
			   "Resposta: " + resposta ;
	}
	
	public void setAll(int pCodigoResposta, String pResposta) {
		setCodigoResposta(pCodigoResposta);
		setResposta(pResposta);
	}

	public int getCodigoResposta() {
		return codigoResposta;
	}

	public void setCodigoResposta(int codigoResposta) {
		this.codigoResposta = codigoResposta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
}
