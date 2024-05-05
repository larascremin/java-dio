import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }

}
