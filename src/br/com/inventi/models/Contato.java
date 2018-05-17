package br.com.inventi.models;

public class Contato {
    private int cod_contato;
    private Usuario usuario;
    private String comentario;
    private String email;
    private String telefone;

    public Contato(){

    }

    public int getCod_contato() {
        return cod_contato;
    }

    public void setCod_contato(int cod_contato) {
        this.cod_contato = cod_contato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
