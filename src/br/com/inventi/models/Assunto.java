package br.com.inventi.models;

	/*
	 * Classe responsável por tratar os atributos de um assunto gerado pelo usuário.
	 */

public class Assunto{
	
	private String assunto;
	private Pergunta pergunta;
	private Resposta resposta;
	
	public Assunto() {
		
	}
	
	public Assunto(String pAssunto, Pergunta pPergunta, Resposta pResposta) {
		setAssunto(pAssunto);
		setPergunta(pPergunta);
		setResposta(pResposta);
	}	
	
	public void setAll(String pAssunto, Pergunta pPergunta, Resposta pResposta) {
		setAssunto(pAssunto);
		setPergunta(pPergunta);
		setResposta(pResposta);
	}	
	
	public String getAll() {
		return "Assunto: " + assunto + "\n" +
			   "Pergunta: " + pergunta.getAll() + "\n" +
			   "Resposta: " + resposta.getAll();
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public Resposta getResposta() {
		return resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}
	
}
