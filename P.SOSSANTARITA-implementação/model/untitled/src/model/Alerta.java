package model;

import java.time.LocalDate;

public class Alerta {

    private int id;
    private String mensagem;
    private String nivel;
    private LocalDate data;

    public Alerta() {
    }

    public Alerta(int id, String mensagem, String nivel, LocalDate data) {
        this.id = id;
        this.mensagem = mensagem;
        this.nivel = nivel;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void emitirAlerta() {
        System.out.println("Alerta enviado com sucesso.");
    }
}
