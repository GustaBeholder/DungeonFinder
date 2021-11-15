package br.com.gustavolemillion.DAO;

import br.com.gustavolemillion.Entity.Jogador;
import br.com.gustavolemillion.Entity.Mesa;
import br.com.gustavolemillion.Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JogadorMesaDAO {

    private Connection connection;


    public JogadorMesaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Connection getConnection() {
        return connection;
    }


    public void adicionaJogadorMesa(Jogador jogador, Mesa mesa){
        String sql = "INSERT INTO jogador_mesa (idJogador, idMesa) values (?, ?)";
        try{
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setInt(1, jogador.getIdJogador());
            stmt.setInt(2, mesa.getIdMesa());
            stmt.execute();
            stmt.close();
            System.out.println("Jogador Vinculado à mesa!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
