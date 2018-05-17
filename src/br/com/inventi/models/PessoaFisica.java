package br.com.inventi.models;

public class PessoaFisica extends Usuario {
    private String cpf;

    public PessoaFisica()
    {

    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
}
