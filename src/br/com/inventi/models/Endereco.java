package br.com.inventi.models;

import java.util.Arrays;

public class Endereco {
    private int codEndereco;
    private char endereco[] = null;
    private String logradouro;
    private int numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    
    public Endereco(){
    	
    }
    
    public Endereco(int codEndereco, String logradouro, int numero, String cep, String bairro, String cidade, String uf) {
    	super();
    	this.codEndereco = codEndereco;
    	this.logradouro = logradouro;
    	this.numero = numero;
    	this.cep = cep;
    	this.bairro = bairro;
    	this.cidade = cidade;
    	this.uf = uf;
    }
    
    public void setAll(int codEndereco, String logradouro, int numero, String cep, String bairro, String cidade, String uf) {
    	setCodEndereco(codEndereco);
    	setLogradouro(logradouro);
    	setNumero(numero);
    	setCep(cep);
    	setBairro(bairro);
    	setCidade(cidade);
    	setUf(uf);
    }
    
    public String getAll() {
    	return
    			"Codigo do endere�o.........." + codEndereco + "\n" +
    			"Logradouro.................." + logradouro + "\n" +
    			"Numero......................" + numero + "\n" +
    			"Cep........................." + cep + "\n" +
    			"Bairro......................" + bairro + "\n" +
    			"Cidade......................" + cidade + "\n" +
    			"UF.........................." + uf;
    }

    public int getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }

    public Endereco(char endereco[]) {
        this.endereco = Arrays.copyOf(endereco, endereco.length);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
