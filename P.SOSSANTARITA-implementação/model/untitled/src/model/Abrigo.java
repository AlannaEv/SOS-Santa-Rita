package model;

public class Abrigo {

    private int id;
    private String nome;
    private String endereco;
    private int capacidade;
    private int ocupacao;
    private String status;
    private String coordenadas;

    public Abrigo() {
    }

    public Abrigo(int id, String nome, String endereco, int capacidade, int ocupacao, String status, String coordenadas) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.ocupacao = ocupacao;
        this.status = status;
        this.coordenadas = coordenadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(int ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void atualizarOcupacao(int ocupacao) {
        this.ocupacao = ocupacao;
        System.out.println("Ocupação atualizada.");
    }

    public boolean possuiVagas() {
        return ocupacao < capacidade;
    }
}
