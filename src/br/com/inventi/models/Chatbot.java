package br.com.inventi.models;

public class Chatbot {
    private int codChatbot;
    private String nomeChatbot;
    private String palavraChave;
    private Pergunta pergunta;


    //Construtor vazio
    public Chatbot()
    {
        super();
    }

    //Construtor cheio
    public Chatbot(int codChatbot, String nomeChatbot, String palavraChave, Pergunta pergunta)
    {
        super();
        setCodChatbot(codChatbot);
        setNomeChatbot(nomeChatbot);
        setPalavraChave(palavraChave);
        setPergunta(pergunta);
    }

    public String getAll()
    {
        return + codChatbot + "\n"
                + nomeChatbot + "\n"
                + palavraChave + "\n"
                + pergunta.getAll() + "\n";
    }

    public void setAll(int codChatbot, String nomeChatbot, String palavraChave, Pergunta pergunta)
    {
        setCodChatbot(codChatbot);
        setNomeChatbot(nomeChatbot);
        setPalavraChave(palavraChave);
        setPergunta(pergunta);
    }

    public int getCodChatbot() {
        return codChatbot;
    }

    public void setCodChatbot(int codChatbot) {
        this.codChatbot = codChatbot;
    }

    public String getNomeChatbot() {
        return nomeChatbot;
    }

    public void setNomeChatbot(String nomeChatbot) {
        this.nomeChatbot = nomeChatbot;
    }

    public String palavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
}
