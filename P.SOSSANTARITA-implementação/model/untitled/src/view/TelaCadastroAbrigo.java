package view;
import dao.AbrigoDAO;
import model.Abrigo;

import javax.swing.*;
import java.awt.*;


public class TelaCadastroAbrigo extends JFrame{

    TelaCadastroAbrigo(){
        setTitle("CADASTRO ABRIGO ");
        setSize(700, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(5,2,10,10));

        add(painel);

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblEndereco = new JLabel("Endereco:");
        JTextField txtEndereco = new JTextField();

        JLabel lblCapacidade = new JLabel("Capacidade:");
        JTextField txtCapacidade = new JTextField();

        JLabel lblStatus = new JLabel("Status:");
        JTextField txtStatus = new JTextField();

        JLabel lblOcupacao = new JLabel("Ocupacao:");
        JTextField txtOcupacao = new JTextField();

        JLabel lblCoordenadas = new JLabel("Coordenadas:");
        JTextField txtCoordenadas = new JTextField();

        JButton btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.addActionListener(e -> {

        Abrigo ab = new Abrigo();

        ab.setNome(txtNome.getText());
        ab.setEndereco(txtEndereco.getText());
        ab.setCoordenadas(txtCoordenadas.getText());
        ab.setCapacidade(Integer.parseInt(txtCapacidade.getText()));
        ab.setStatus(txtStatus.getText());
        ab.setOcupacao(Integer.parseInt(txtOcupacao.getText()));

        AbrigoDAO dao = new AbrigoDAO();
        dao.inserir(ab);

    });

        painel.add(lblNome);
        painel.add(txtNome);

        painel.add(lblEndereco);
        painel.add(txtEndereco);

        painel.add(lblCoordenadas);
        painel.add(txtCoordenadas);

        painel.add(lblCapacidade);
        painel.add(txtCapacidade);

        painel.add(lblStatus);
        painel.add(txtStatus);

        painel.add(lblOcupacao);
        painel.add(txtOcupacao);



        painel.add(new JLabel());
        painel.add(btnCadastrar);
    }
}
