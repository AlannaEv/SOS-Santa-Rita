package dao;

import model.Abrigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AbrigoDAO {

    public void inserir(Abrigo abrigo){

        String sql = "INSERT INTO abrigo (id, nome, endereco, capacidade, ocupacao, status, coordenadas) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try(Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)){

            stmt.setInt(1, abrigo.getId());
            stmt.setString(2, abrigo.getNome());
            stmt.setString(3, abrigo.getEndereco());
            stmt.setInt(4, abrigo.getCapacidade());
            stmt.setInt(5, abrigo.getOcupacao());
            stmt.setString(6, abrigo.getStatus());
            stmt.setString(7, abrigo.getCoordenadas());

            stmt.executeUpdate();

            System.out.println("Abrigo cadastrado!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}