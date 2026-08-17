package dao;

import model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(Usuario usuario){

        String sql =
                "INSERT INTO usuario (nome, email, senha) VALUES (?, ?, ?)";

        try(Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)){

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());

            stmt.executeUpdate();

            System.out.println("Usuário cadastrado com sucesso!");

        }catch(SQLException e){
            System.out.println("Erro ao cadastrar usuário.");
            e.printStackTrace();
        }
    }
}