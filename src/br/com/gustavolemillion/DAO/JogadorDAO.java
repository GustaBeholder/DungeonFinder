package br.com.gustavolemillion.DAO;

import java.sql.*;

import br.com.gustavolemillion.Entity.Jogador;
import br.com.gustavolemillion.Factory.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;

public class JogadorDAO {
    private Connection connection;


    public JogadorDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    public  List<Jogador> retornaJogador() throws RuntimeException{
        List<Jogador> listaJogador = new ArrayList<Jogador>();
        Jogador jogador;

        String sql = "SELECT * FROM Jogador";
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){

                jogador = new Jogador();
                jogador.setIdJogador(rs.getInt("idJogador"));
                jogador.setEmail(rs.getString("email"));
                jogador.setNome(rs.getString("nome"));


                listaJogador.add(jogador);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaJogador;
    }

    public void adcionaJogador(Jogador jogador) throws RuntimeException{
        String sql = "INSERT INTO jogador (email, nome) values (?,?)";
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, jogador.getEmail());
            stmt.setString(2, jogador.getNome());
            stmt.execute();
            stmt.close();
            System.out.println("Jogador Adcionado!");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    
    public Jogador validaLogin(String email){
        Jogador jogador = new Jogador();

        String sql = "SELECT * FROM Jogador where email = '"+email+"'";
        
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                
                jogador.setIdJogador(rs.getInt("idJogador"));
                jogador.setEmail(rs.getString("email"));
                jogador.setNome(rs.getString("nome"));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return jogador;
    }
        
}

