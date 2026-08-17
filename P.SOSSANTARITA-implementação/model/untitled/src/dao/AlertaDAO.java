package dao;

import model.Alerta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlertaDAO {

    public void inserir(Alerta alerta){

        String sql = "INSERT INTO alerta (id, mensagem, nivel, data) VALUES (?, ?, ?, ?)";

        try(Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)){

            stmt.setInt(1, alerta.getId());
            stmt.setString(2, alerta.getMensagem());
            stmt.setString(3, alerta.getNivel());
            stmt.setDate(4, java.sql.Date.valueOf(alerta.getData()));

            stmt.executeUpdate();

            System.out.println("Alerta cadastrado!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}