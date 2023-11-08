package br.senai.sp.jandira.model;

public abstract class Voo {
    private String companhia, destino, origem, horaPartida, dataPartida;
    private int quantidadePassageiros, numeroVoo;

    public Voo(String companhia, String destino, String origem, String horaPartida, String dataPartida, int numeroVoo, int quantidadePassageiros) {
        this.companhia = companhia;
        this.destino = destino;
        this.origem = origem;
        this.horaPartida = horaPartida;
        this.dataPartida = dataPartida;
        this.numeroVoo = numeroVoo;
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public abstract String print();

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
}
