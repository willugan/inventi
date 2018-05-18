package br.com.inventi.models;

public class Navegabilidade  {
    private int codNav;
    private String linkAjuda;
    private Chatbot chatbot;

    //Construtor vazio
    public Navegabilidade()
    {
        super();
    }

    //Construtor cheio
    public Navegabilidade(int codNav, String linkAjuda, Chatbot chatbot) {
        this.codNav = codNav;
        this.linkAjuda = linkAjuda;
        this.chatbot = chatbot;
    }

    public void setAll(int codNav, String linkAjuda, Chatbot chatbot) {
        this.codNav = codNav;
        this.linkAjuda = linkAjuda;
        this.chatbot = chatbot;
    }

    public String getAll()
    {
        return "Código da navegabilidade....... "+codNav + "\n" +
               "Links da página................ "+linkAjuda + "\n"
               +"Chatbot....................... "+ chatbot.getAll();
    }

    public int getCodNav() {return codNav;}

    public void setCodNav(int codNav) {
        this.codNav = codNav;
    }

    public String getLinkAjuda() {
        return linkAjuda;
    }

    public void setLinkAjuda(String linkAjuda) {
        this.linkAjuda = linkAjuda;
    }

    public Chatbot getChatbot() {
        return chatbot;
    }

    public void setChatbot(Chatbot chatbot) {
        this.chatbot = chatbot;
    }
}
