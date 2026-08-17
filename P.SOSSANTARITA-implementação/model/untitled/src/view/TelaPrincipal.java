package view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

private JPanel painel;

    public TelaPrincipal() {
        setTitle("SOS SANTA RITA ");
        setSize(700, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painel = new JPanel();

        painel.setLayout(new BorderLayout());

        add(painel);

        JLabel titulo = new JLabel("SOS SANTA RITA");

        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        titulo.setFont(new Font("Arial", Font.BOLD, 26));

        painel.add(titulo, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel();

        painelBotoes.setLayout(new GridLayout(5,1,10,10));

        JButton btnUsuario = new JButton("Cadastrar Usuário");
        JButton btnAbrigo = new JButton("Cadastrar Abrigo");
        JButton btnOcorrencia = new JButton("Registrar Ocorrência");
        JButton btnAlerta = new JButton("Acompanhar alertas");
        JButton btnSair = new JButton("Sair");

        btnUsuario.addActionListener(e -> {
            TelaCadastroUsuario tela = new TelaCadastroUsuario();
            tela.setVisible(true);
        });
        btnAbrigo.addActionListener(e -> {
            TelaCadastroAbrigo tela = new TelaCadastroAbrigo();
            tela.setVisible(true);
        });
        btnOcorrencia.addActionListener(e -> {
            TelaOcorrencia tela = new TelaOcorrencia();
            tela.setVisible(true);
        });
        btnAlerta.addActionListener(e -> {
            TelaAlerta tela = new TelaAlerta();
            tela.setVisible(true);
        });
        btnSair.addActionListener(e -> {
            dispose(); // Fecha apenas a TelaPrincipal
        });


        painelBotoes.add(btnUsuario);
        painelBotoes.add(btnAbrigo);
        painelBotoes.add(btnOcorrencia);
        painelBotoes.add(btnAlerta);
        painelBotoes.add(btnSair);

        painel.add(painelBotoes, BorderLayout.CENTER);



    }
}
