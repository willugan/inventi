package br.com.inventi.models;

public class PessoaFisica extends Usuario {
    private String cpf;

    public PessoaFisica()
    {

    }
    
    public PessoaFisica(String cpf) {
    	super();
    	this.cpf = cpf;
    }
    
    public void setAll(String cpf) {
    	setCpf(cpf);
    }
    
    public String getAll() {
    	return
    			"CPF: " + cpf;
    }

    /* Falta getAll, setAll, construtor cheio e construtor vazio */

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
}
