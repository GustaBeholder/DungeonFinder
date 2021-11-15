package br.com.gustavolemillion.Entity;

public class JogadorMesa {
    private Integer idJogadorMesa;
    private Integer idJogador;
    private Integer idMesa;

    public JogadorMesa( Integer idJogador, Integer idMesa) {
        this.idJogador = idJogador;
        this.idMesa = idMesa;
    }

    public JogadorMesa() {
    }

    public Integer getIdJogadorMesa() {
        return idJogadorMesa;
    }

    public void setIdJogadorMesa(Integer idJogadorMesa) {
        this.idJogadorMesa = idJogadorMesa;
    }

    public Integer getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(Integer idJogador) {
        this.idJogador = idJogador;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }
}
