package dao;

import model.Ocorrencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OcorrenciaDAO {

    public void inserir(Ocorrencia ocorrencia){

        String sql = "INSERT INTO ocorrencia (id, tipo, descricao, data, status) VALUES (?, ?, ?, ?, ?)";

        try(Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)){

            stmt.setInt(1, ocorrencia.getId());
            stmt.setString(2, ocorrencia.getTipo());
            stmt.setString(3, ocorrencia.getDescricao());
            stmt.setDate(4, java.sql.Date.valueOf(ocorrencia.getData()));
            stmt.setString(5, ocorrencia.getStatus());

            stmt.executeUpdate();

            System.out.println("Ocorrência cadastrada!");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}