package desafios;

import java.util.Scanner;

public class CondicoesUm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();
            String menu = "1. Depositar \n 2. Sacar \n 3. Consultar Saldo \n 4. Encerrar";

            switch (opcao) {
                case 1:
                    Double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.println("Saldo atual:" + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

}
