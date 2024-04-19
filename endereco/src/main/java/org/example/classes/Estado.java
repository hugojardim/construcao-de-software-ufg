package org.example.classes;

public class Estado {
    private String sigla;
    private Pais pais;

    public Estado(String sigla, Pais pais) {
        this.sigla = sigla;
        this.pais = pais;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
