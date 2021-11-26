package br.com.gustavolemillion.DAO;

import br.com.gustavolemillion.Entity.Jogador;
import br.com.gustavolemillion.Entity.Mesa;
import br.com.gustavolemillion.Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Mesa>  retornaMesaJogo(Integer idJogador){
        List<Mesa> mesas = new ArrayList<Mesa>();
        Mesa mesa;
        String sql = "SELECT * from mesa inner join jogador_mesa  on mesa.idmesa = jogador_mesa.idmesa where jogador_mesa.idjogador = "+ idJogador;
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
    
    /*public List<Jogador> retornaJogadoresMesa(Integer idMesa){
        
        String sqlAux = "SELECT  idJogador FROM JOGADOR_MESA WHERE idMesa = "+ idMesa; 
        List<Integer> aux = new ArrayList<>();
        List<Jogador> jogadores = new ArrayList<>();
        Jogador jogador;
        Integer auxInt;
         
        
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sqlAux);
            ResultSet rs = stmt.executeQuery(sqlAux);
            while(rs.next()){

                auxInt = rs.getInt("idJogador");
                          

                aux.add(auxInt);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
        for(Integer i : aux){
            
            String sql = " SELECT NOME FROM JOGADOR WHERE IDJOGADOR = "+ i;
            try {
                PreparedStatement stmt = getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){

                    jogador = new Jogador();
                    jogador.setIdJogador(rs.getInt("idJogador"));
                    jogador.setNome(rs.getString("nome"));


                    jogadores.add(jogador);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            
        }
        return jogadores;
    }*/
}
