package org.example.classes;

public class Endereco {
    private TipoLogradouro tipoLogradouro;
    private String nome;
    private Integer numero;
    private String complemento;
    private Integer CEP;
    private TipoEndereco tipoEndereco;
    private Bairro bairro;

    public Endereco(TipoLogradouro tipoLogradouro, String nome, Integer numero, String complemento, Integer CEP, TipoEndereco tipoEndereco, Bairro bairro) {
        this.tipoLogradouro = tipoLogradouro;
        this.nome = nome;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.tipoEndereco = tipoEndereco;
        this.bairro = bairro;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public Integer getCEP() {
        return CEP;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public Bairro getBairro() {
        return bairro;
    }
}
