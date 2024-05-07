package desafios;

import java.util.Scanner;

public class CondicoesCinco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double valorSaque = scanner.nextDouble();

        for (int cont = 1; valorSaque != 0; cont++) {
            if (valorSaque <= limiteDiario) {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            valorSaque = scanner.nextDouble();
            System.out.println("Transacoes encerradas.");
        }
        scanner.close();
    }

}
