package model;

import java.time.LocalDate;

public class Ocorrencia {

    private int id;
    private String tipo;
    private String descricao;
    private LocalDate data;
    private String status;

    public Ocorrencia() {
    }

    public Ocorrencia(int id, String tipo, String descricao, LocalDate data, String status) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void registrarOcorrencia() {
        System.out.println("Ocorrência registrada com sucesso.");
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status atualizado para: " + novoStatus);
    }
}