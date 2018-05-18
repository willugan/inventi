package br.com.inventi.models;

public class Usuario {
    private int codUsuario;
    private String nome;
    private String nomeUsuario;
    private String senha;
    private Endereco[] endereco;

    public Usuario()
    {

    }

    public Usuario(int codUsuario, String nome, String nomeUsuario, String senha, Endereco[] endereco) {
    	this.codUsuario = codUsuario;
    	this.nome = nome;
    	this.nomeUsuario = nomeUsuario;
    	this.senha = senha;
    	this.endereco = endereco;
    }    
    
    public void setAll(int codUsuario, String nome, String nomeUsuario, String senha, Endereco[] endereco) {
    	setCodUsuario(codUsuario);
    	setNome(nome);
    	setNomeUsuario(nomeUsuario);
    	setSenha(senha);
    	setEndereco(endereco);
    }
    
    public String getAll() {
    	return
    		"Codigo do Usuario......" + codUsuario + "\n" +
    		"Nome..................." + nome + "\n" +
    		"Nome do usuário........" + nomeUsuario + "\n" +
    		"Senha.................." + senha + "\n" +
    		"Endereço..............." + endereco.getAll();
    }
   
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

    //Atributo de ref como array [Endereco do usuario]
    public Endereco[] getEndereco() {
        return endereco[];
    }

    public void setEndereco(Endereco[] endereco) {
        this.endereco[] = endereco;
    }
    
}
