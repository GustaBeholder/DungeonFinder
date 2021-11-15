package br.com.gustavolemillion;

import br.com.gustavolemillion.DAO.JogadorDAO;
import br.com.gustavolemillion.DAO.JogadorMesaDAO;
import br.com.gustavolemillion.DAO.MesaDAO;
import br.com.gustavolemillion.Entity.Jogador;
import br.com.gustavolemillion.Entity.Mesa;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        List<Mesa> listaMesas;
        MesaDAO mesaDAO = new MesaDAO();
        JogadorDAO jogadorDAO = new JogadorDAO();
        List<Jogador> listaJogadores;
        JogadorMesaDAO jogadorMesaDAO = new JogadorMesaDAO();
        Mesa mesaAtual = new Mesa();
        Jogador jogadorAtual = new Jogador();


        listaJogadores = jogadorDAO.retornaJogador();
        listaMesas = mesaDAO.retornaMesas("");

        for(Jogador jogador : listaJogadores) {
            if (jogador.getIdJogador() == 43) {
                jogadorAtual = jogador;
            }
        }
        for(Mesa mesa : listaMesas){
            if(mesa.getIdMesa() == 5){
                mesaAtual = mesa;
            }
        }

        jogadorMesaDAO.adicionaJogadorMesa(jogadorAtual, mesaAtual);


    }
}
