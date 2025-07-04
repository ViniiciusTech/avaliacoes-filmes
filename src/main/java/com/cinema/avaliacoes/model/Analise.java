package com.cinema.avaliacoes.model;

public class Analise {
    private Long id;
    private Long filmeId;
    private String texto;
    private int nota;

    public Analise() {}

    public Analise(Long filmeId, String texto, int nota) {
        this.filmeId = filmeId;
        this.texto = texto;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(Long filmeId) {
        this.filmeId = filmeId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
