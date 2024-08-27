import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Saldo da conta: ");
        int saldo = scanner.nextInt();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
