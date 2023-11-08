package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        VooGol vooGol = new VooGol("Gol", "SBGR - Guarulhos", "SBGL - Galeão", "13:40", "08/09/2024", 925, 132);
        VooEmirates vooEmirates = new VooEmirates("Emirates", "SBCT - Curitiba", "SBKP - Campinas", "16:30", "17/11/2023", 653, 180);
        VooDelta vooDelta = new VooDelta("Delta", "SBCT - Curitiba", "SDU - Rio de Janeiro", "17:30", "25/12/2023", 244, 94);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seja Bem Vindo!!");
            System.out.println("1 - Voos Gol");
            System.out.println("2 - Voos Emirates");
            System.out.println("3 - Voos Delta");
            System.out.println("4 - Consultar Voos");
            System.out.println("5 - Sair");
            System.out.print("Escolha sua opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n" + vooGol.print() + "\n");
                    break;
                case 2:
                    System.out.println("\n" + vooEmirates.print() + "\n");
                    break;
                case 3:
                    System.out.println("\n" + vooDelta.print() + "\n");
                    break;
                case 4:
                    while (true) {
                        consultarVoos(scanner, vooGol, vooEmirates, vooDelta);
                    }
                case 5:
                    continuar = false;
                    break;
                default:
            }
        }
    }

    public void consultarVoos(Scanner scanner, VooGol vooGol, VooEmirates vooEmirates, VooDelta vooDelta) {
        System.out.println("Opções de Consulta:");
        System.out.println("1 - Consultar por Número do Voo");
        System.out.println("2 - Consultar por Origem");
        System.out.println("3 - Consultar por Destino");
        System.out.println("4 - Consultar por Data de Partida");
        System.out.println("5 - Voltar ao Menu Principal");
        System.out.print("Escolha sua opção de consulta: ");

        int opcaoConsulta = scanner.nextInt();
        scanner.nextLine();

        switch (opcaoConsulta) {
            case 1:
                System.out.print("Digite o número do voo: ");
                int numeroVoo = scanner.nextInt();
                consultaNumeroVoo(numeroVoo, vooGol, vooEmirates, vooDelta);
                break;
            case 2:
                System.out.print("Digite a origem: ");
                String origem = scanner.nextLine();
                consultaOrigem(origem, vooGol, vooEmirates, vooDelta);
                break;
            case 3:
                System.out.print("Digite o destino: ");
                String destino = scanner.nextLine();
                consultaDestino(destino, vooGol, vooEmirates, vooDelta);
                break;
            case 4:
                System.out.print("Digite a data de partida (dd/mm/yyyy): ");
                String dataPartida = scanner.nextLine();
                consultarDataPartida(dataPartida, vooGol, vooEmirates, vooDelta);
                break;
            case 5:
                break;
            default:
        }
    }

    public void consultaNumeroVoo(int numeroVoo, VooGol vooGol, VooEmirates vooEmirates, VooDelta vooDelta) {
        if (numeroVoo == vooGol.getNumeroVoo()) {
            System.out.println(vooGol.print());
        } else if (numeroVoo == vooEmirates.getNumeroVoo()) {
            System.out.println(vooEmirates.print());
        } else if (numeroVoo == vooDelta.getNumeroVoo()) {
            System.out.println(vooDelta.print());
        } else {
            System.out.println("Voo não encontrado.");
        }
    }

    public void consultaOrigem(String origem, VooGol vooGol, VooEmirates vooEmirates, VooDelta vooDelta) {
        if (origem.equalsIgnoreCase(vooGol.getOrigem())) {
            System.out.println(vooGol.print());
        } else if (origem.equalsIgnoreCase(vooEmirates.getOrigem())) {
            System.out.println(vooEmirates.print());
        } else if (origem.equalsIgnoreCase(vooDelta.getOrigem())) {
            System.out.println(vooDelta.print());
        } else {
            System.out.println("Voo não encontrado.");
        }
    }

    public void consultaDestino(String destino, VooGol vooGol, VooEmirates vooEmirates, VooDelta vooDelta) {
        if (destino.equalsIgnoreCase(vooGol.getDestino())) {
            System.out.println(vooGol.print());
        } else if (destino.equalsIgnoreCase(vooEmirates.getDestino())) {
            System.out.println(vooEmirates.print());
        } else if (destino.equalsIgnoreCase(vooDelta.getDestino())) {
            System.out.println(vooDelta.print());
        } else {
            System.out.println("Voo não encontrado.");
        }
    }

    public void consultarDataPartida(String dataPartida, VooGol vooGol, VooEmirates vooEmirates, VooDelta vooDelta) {
        if (dataPartida.equals(vooGol.getDataPartida())) {
            System.out.println(vooGol.print());
        } else if (dataPartida.equals(vooEmirates.getDataPartida())) {
            System.out.println(vooEmirates.print());
        } else if (dataPartida.equals(vooDelta.getDataPartida())) {
            System.out.println(vooDelta.print());
        } else {
            System.out.println("Voo não encontrado.");
        }
    }
}
