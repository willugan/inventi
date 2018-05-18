package br.com.inventi.models;

public class PessoaJuridica extends Usuario {
    private String cnpj;
    
    
    public PessoaJuridica() {
    	super();
    }
    
    public void setAll(String cnpj) {
    	setCnpj(cnpj);
    }
    
    public String getAll() {
    	return
    		"CNPJ: " + cnpj;
    }

    /* Falta getAll, setAll, construtor cheio e construtor vazio */

    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
}
