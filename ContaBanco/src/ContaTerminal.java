import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, insira a agência: ");
        String agencia = scanner.next();

        // Limpa o buffer para capturar a próxima linha corretamente
        scanner.nextLine();

        System.out.print("Por favor, insira o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, insira o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
