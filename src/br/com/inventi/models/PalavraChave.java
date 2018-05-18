package br.com.inventi.models;

/*
 * Classe responsável pelo objeto Palavra-Chave, com seus atributos e metodos.
 * */

public class PalavraChave{
	private int codigoPalavra;
	private String palavraChave;
	private Resposta resposta;
	private Pergunta pergunta;
	
	public PalavraChave() {
		
	}
	
	public PalavraChave(int pCodigoPalavra, String pPalavraChave, Resposta pResposta, Pergunta pPergunta) {
		setCodigoPalavra(pCodigoPalavra);
		setPalavraChave(pPalavraChave);
		setResposta(pResposta);
		setPergunta(pPergunta);		
	}
	
	public String getAll(){		
		return "Codigo da Palava chave: " + codigoPalavra + "\n" +
			   "Palavra Chave: " + palavraChave + "\n" +
			   "Resposta: " + resposta.getAll() + "\n" +
			   "Pergunta: " + pergunta.getAll();		
	}
	
	public void setAll(int pCodigoPalavra, String pPalavraChave, Resposta pResposta, Pergunta pPergunta) {
		setCodigoPalavra(pCodigoPalavra);
		setPalavraChave(pPalavraChave);
		setResposta(pResposta);
		setPergunta(pPergunta);
	}

	public int getCodigoPalvra() {
		return codigoPalavra;
	}

	public void setCodigoPalavra(int codigoPalvra) {
		this.codigoPalavra = codigoPalvra;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	public Resposta getResposta() {
		return resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
	
	
}
