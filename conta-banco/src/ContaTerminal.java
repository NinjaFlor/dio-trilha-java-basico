import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner

        Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor,digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor,digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor,digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Por favor,digite o saldo: ");
        Double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada

        System.out.println("\n Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " +
                saldo + " já está disponível para saque");

        scanner.close();
    }

}
