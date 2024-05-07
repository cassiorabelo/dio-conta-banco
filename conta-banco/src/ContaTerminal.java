import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Classe ContaTerminal</h1>
 * Recebe as informações de:
 * <ul>
 * <li>número da conta;</li>
 * <li>código da agência;</li>
 * <li>nome do cliente;</li>
 * <li>saldo</li>
 * </ul>
 * relativos a uma conta bancária e imprime na tela uma mensagem final com os
 * valores inseridos.
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite as informações solicitadas a seguir.\n");
        System.out.print("Número da conta (ex: 1021): ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Código da agência, com o dígito (ex: 067-8): ");
        String branchCode = scanner.nextLine();

        System.out.print("Nome do cliente (ex: Mario Andrade): ");
        String customerName = scanner.nextLine();

        System.out.print("Saldo (ex: 237.48): ");
        double accountBalance = scanner.nextDouble();

        System.out.println("\nOlá, " + customerName + "!\nObrigado por criar uma conta em nosso banco. \nSua agência é "
                + branchCode + ", conta " + accountNumber + " e o saldo de " + accountBalance
                + " já está disponível para saque.");

        scanner.close();
    }
}
