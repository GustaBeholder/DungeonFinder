package br.com.gustavolemillion.Entity;

public class Jogador {
    private Integer idJogador;
    private String email;
    private String nome;

    public Jogador() {
    }

    public Jogador(String email, String nome) {

        this.email = email;
        this.nome = nome;
    }

    public Integer getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(Integer idJogador) {
        this.idJogador = idJogador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
