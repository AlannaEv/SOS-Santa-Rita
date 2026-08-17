package view;

import dao.UsuarioDAO;
import model.Usuario;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class TelaCadastroUsuario extends JFrame {

    TelaCadastroUsuario(){
        setTitle("CADASTRO USUARIO ");
        setSize(700, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(4,2,10,10));

        add(painel);

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblEmail = new JLabel("E-mail:");
        JTextField txtEmail = new JTextField();

        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField();

        JButton btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.addActionListener(e -> {

            Usuario u = new Usuario();

            u.setNome(txtNome.getText());
            u.setEmail(txtEmail.getText());

            String senha = new String(txtSenha.getPassword());
            u.setSenha(senha);

            UsuarioDAO dao = new UsuarioDAO();
            dao.inserir(u);

        });


        painel.add(lblNome);
        painel.add(txtNome);

        painel.add(lblEmail);
        painel.add(txtEmail);

        painel.add(lblSenha);
        painel.add(txtSenha);

        painel.add(new JLabel()); // espaço vazio
        painel.add(btnCadastrar);





    }
}
