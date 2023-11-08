package br.senai.sp.jandira.model;

public class VooDelta extends Voo {
    public VooDelta(String companhia, String destino, String origem, String horaSaida, String dataSaida, int numeroVoo, int qtdePassageiros) {
        super(companhia, destino, origem, horaSaida, dataSaida, numeroVoo, qtdePassageiros);
    }

    @Override
    public String print() {
        return "Voo Delta\n" +
                "Companhia: " + super.getCompanhia() + "\n" +
                "Origem: " + super.getOrigem() + "\n" +
                "Destino: " + super.getDestino() + "\n" +
                "Hora de Partida: " + super.getHoraPartida() + "\n" +
                "Data de Partida: " + super.getDataPartida() + "\n" +
                "Número do Voo: " + super.getNumeroVoo() + "\n" +
                "Quantidade de Passageiros: " + super.getQuantidadePassageiros();
    }
}
