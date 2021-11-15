package br.com.gustavolemillion.DAO;
import java.sql.*;

import br.com.gustavolemillion.Entity.Jogador;
import br.com.gustavolemillion.Entity.Mesa;
import br.com.gustavolemillion.Factory.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;

public class MesaDAO {

    private Connection connection;


    public MesaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    public List<Mesa> retornaMesas(String pesquisa) throws RuntimeException {
        List<Mesa> mesas = new ArrayList<Mesa>();
        Mesa mesa;

        String sql = "SELECT * FROM mesa where descricao LIKE '%"+pesquisa+"%' or sistema LIKE '%"+pesquisa+"%'";
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){

                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setDescricao(rs.getString("descricao"));
                mesa.setSistema(rs.getString("sistema"));
                mesa.setIdMestre(rs.getInt("idMestre"));
                mesa.setTitulo(rs.getString("titulo"));

                mesas.add(mesa);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return mesas;
    }

    public void criaMesa(Mesa mesa) throws RuntimeException {
        String sql = "INSERT INTO mesa (descricao, sistema, idMestre, titulo) values (?,?,?, ?)";
        try{
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, mesa.getDescricao());
            stmt.setString(2, mesa.getSistema());
            stmt.setInt(3, mesa.getIdMestre());
            stmt.setString(4, mesa.getTitulo());
            stmt.execute();
            stmt.close();
            System.out.println("Mesa criada!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    
    public Jogador getMestre(Mesa mesaAtual) throws RuntimeException {
        String sql = "select nome from jogador INNER JOIN MESA on jogador.idJogador = mesa.idmestre where mesa.idmestre ="+mesaAtual.getIdMestre();
        Jogador jogador = null;
         try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){

                jogador = new Jogador();
                jogador.setNome(rs.getString("nome"));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return jogador;
    }



}
