package view;

import dao.OcorrenciaDAO;
import dao.UsuarioDAO;
import model.Ocorrencia;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class TelaOcorrencia extends JFrame {

    TelaOcorrencia(){
        setTitle("REGISTRAR OCORRENCIA ");
        setSize(500, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(5,2,10,10));

        add(painel);

        JLabel lblTipo = new JLabel("Tipo:");
        JTextField txtTipo = new JTextField();

        JLabel lblDescricao = new JLabel("Descrição:");
        JTextField txtDescricao = new JTextField();

        JLabel lblData = new JLabel("Data:");
        JTextField txtData = new JTextField();

        JLabel lblStatus = new JLabel("Status:");
        JTextField txtStatus = new JTextField();

        JButton btnRegistrar = new JButton("Registrar");

        btnRegistrar.addActionListener(e -> {

            Ocorrencia o = new Ocorrencia();

            o.setTipo(txtTipo.getText());
            o.setDescricao(txtDescricao.getText());
            o.setData(LocalDate.parse(txtData.getText()));
            o.setStatus(txtStatus.getText());


            OcorrenciaDAO dao = new OcorrenciaDAO();
            dao.inserir(o);

        });

        painel.add(lblTipo);
        painel.add(txtTipo);

        painel.add(lblDescricao);
        painel.add(txtDescricao);

        painel.add(lblData);
        painel.add(txtData);

        painel.add(lblStatus);
        painel.add(txtStatus);

        painel.add(new JLabel());
        painel.add(btnRegistrar);


    }
}
