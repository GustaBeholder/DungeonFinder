package br.com.gustavolemillion.Entity;

public class Mesa {
    private Integer idMesa;
    private String descricao;
    private String sistema;
    private Integer idMestre;
    private String titulo;

    public Mesa(String descricao, String sistema, Integer idMestre, String titulo) {
        this.descricao = descricao;
        this.sistema = sistema;
        this.idMestre = idMestre;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Mesa() {
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public Integer getIdMestre() {
        return idMestre;
    }

    public void setIdMestre(Integer idMestre) {
        this.idMestre = idMestre;
    }
}
