package br.com.inventi.models;

public class Sessao {
	
	private int sessao;
	private Usuario usuario;
	private String tempoEntrada;
	private String tempoSaida;
	private String tempoPermanencia;
	
	
	
	public Sessao(int sessao, Usuario usuario, String tempoEntrada, String tempoSaida, String tempoPermanencia) {
		super();
		this.sessao = sessao;
		this.usuario = usuario;
		this.tempoEntrada = tempoEntrada;
		this.tempoSaida = tempoSaida;
		this.tempoPermanencia = tempoPermanencia;
	}

	public Sessao() {
		super();
	}
	
	public void setAll(int sessao, Usuario usuario, String tempoEntrada, String tempoSaida, String tempoPermanencia) {
		setSessao(sessao);
		setUsuario(usuario);
		setTempoEntrada(tempoEntrada);
		setTempoSaida(tempoSaida);
		setTempoPermanencia(tempoPermanencia);
	}

	public String getAll() {
		return 
		"Sessão..............." + sessao + "\n" +
		"Usuário.............." + usuario + "\n" +
		"Tempo de Entrada....." + tempoEntrada + "\n" +
		"Tempo de Saida......." + tempoSaida + "\n" +
		"Tempo de Permanencia." + tempoPermanencia;
	}
	public int getSessao() {
		return sessao;
	}
	public void setSessao(int sessao) {
		this.sessao = sessao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTempoEntrada() {
		return tempoEntrada;
	}
	public void setTempoEntrada(String tempoEntrada) {
		this.tempoEntrada = tempoEntrada;
	}
	public String getTempoSaida() {
		return tempoSaida;
	}
	public void setTempoSaida(String tempoSaida) {
		this.tempoSaida = tempoSaida;
	}
	public String getTempoPermanencia() {
		return tempoPermanencia;
	}
	public void setTempoPermanencia(String tempoPermanencia) {
		this.tempoPermanencia = tempoPermanencia;
	}
	
}
