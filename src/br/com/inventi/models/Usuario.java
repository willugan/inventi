package br.com.inventi.models;

public class Usuario {
    private int codUsuario;
    private String nome;
    private String nomeUsuario;
    private String senha;

    public Usuario(){

    }

    /* Getters e Setters */

    //Codigo usuario
    public int getCodUsuario()
    {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario)
    {
        this.codUsuario = codUsuario;
    }

    //Nome do usuario
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    //Nome de usuario
    public String getNomeUsuario()
    {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario)
    {
        this.nomeUsuario = nomeUsuario;
    }

    //Senha usuario
    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }






}
