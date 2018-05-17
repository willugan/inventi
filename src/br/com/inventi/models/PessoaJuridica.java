package br.com.inventi.models;

public class PessoaJuridica extends Usuario {
    private String cnpj;

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
