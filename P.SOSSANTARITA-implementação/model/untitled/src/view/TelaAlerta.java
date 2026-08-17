package view;

import dao.AlertaDAO;
import dao.UsuarioDAO;
import model.Alerta;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class TelaAlerta extends JFrame {

    TelaAlerta(){

        setTitle("ACOMPANHAR ALERTAS ");
        setSize(700, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(5,2,10,10));

        add(painel);

        JLabel lblMensagem = new JLabel("Mensagem:");
        JTextField txtMensagem = new JTextField();

        JLabel lblNinel = new JLabel("Nivel:");
        JTextField txtNivel = new JTextField();

        JLabel lblData = new JLabel("Data:");
        JTextField txtData = new JTextField();

        JButton btnEnviar = new JButton("Enviar");

        btnEnviar.addActionListener(e -> {

            Alerta a = new Alerta();

            a.setMensagem(txtMensagem.getText());
            a.setNivel(txtNivel.getText());
            a.setData(LocalDate.parse(txtData.getText()));

            AlertaDAO dao = new AlertaDAO();
            dao.inserir(a);

        });

        painel.add(lblMensagem);
        painel.add(txtMensagem);

        painel.add(lblNinel);
        painel.add(txtNivel);

        painel.add(lblData);
        painel.add(txtData);

        painel.add(new JLabel()); // espaço vazio
        painel.add(btnEnviar);
    }
}
