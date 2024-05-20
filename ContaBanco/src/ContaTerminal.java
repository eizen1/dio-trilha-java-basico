import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo:");
        String nome = scanner.next();

        System.out.println("Valor a ser depositado:");
        Double saldo = scanner.nextDouble();

        
        System.out.println("Olá "+(nome)+" obrigado por criar uma conta em nosso banco, a suas agência é "+(agencia)+ "e seu saldo R$"+(saldo)+", já está disponível para saque.");

    }
}
