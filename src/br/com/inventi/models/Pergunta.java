package br.com.inventi.models;

public class Pergunta {
    private int codPergunta;
    private String pergunta;
    private Usuario usuario;


    //Construtor vazio
    public Pergunta()
    {
        super();
    }

    //Construtor cheio
    public Pergunta(int codPergunta, String pergunta, Usuario usuario)
    {
        this.codPergunta = codPergunta;
        this.pergunta = pergunta;
        this.usuario = usuario;
    }

    public String getAll()
    {
        return + codPergunta + "\n"
            + pergunta + "\n"
            + usuario.getAll()+ "\n";
    }

    public void setAll(int codPergunta, String pergunta, Usuario usuario)
    {
        this.codPergunta = codPergunta;
        this.pergunta = pergunta;
        this.usuario = usuario;
    }

    public int getCodPergunta() {
        return codPergunta;
    }

    public void setCodPergunta(int codPergunta) {
        this.codPergunta = codPergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
