package br.com.inventi.models;

public class Contato {
    private int codContato;
    private Usuario usuario;
    private String comentario;
    private String email;
    private String telefone;

    
    public Contato() {

    }
    
    public Contato(int codContato, Usuario usuario, String comentario, String email, String telefone) {
    	super();
    	this.codContato = codContato;
    	this.usuario = usuario;
    	this.comentario = comentario;
    	this.email = email;
    	this.telefone = telefone;
    }
    
    
    public void setAll(int codContato, Usuario usuario, String comentario, String email, String telefone) {
    	setCodContato(codContato);
    	setUsuario(usuario);
    	setComentario(comentario);
    	setEmail(email);
    	setTelefone(telefone);
    }
    
    
    public String getAll() {
    	return
    	"Codigo de contato....." + codContato + "\n" +
    	"Usuário..............." + usuario.getAll() + "\n" +
    	"Comentario............" + comentario + "\n" +
    	"Email................." + email + "\n" +
    	"Telefone.............." + telefone;
    }

    public int getCodContato() {
        return codContato;
    }

    public void setCodContato(int cod_contato) {
        this.codContato = cod_contato;
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
