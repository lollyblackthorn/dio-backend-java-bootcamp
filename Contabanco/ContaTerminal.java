package Contabanco;

//import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            //Exibir as mensagens para o nosso usuário
            // Obter pela scanner os valores digitados no terminaL
            System.out.println("Digite o número da sua conta: ");

            int numeroConta = scanner.nextInt();
            
            
            System.out.println("Digite o número da sua agência: ");
            String agencia = scanner.next();

            System.out.println("Informe o seu nome: ");
            String nomeCliente = scanner.next();
            
            System.out.println("Digite o saldo da sua conta: R$ ");
            double saldo = scanner.nextDouble();
            


            //Exibir a mensagem conta criada
            System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + "já está disponível para saque.");
        }
        
        /**
         * int numeroConta = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;
        **/

    }

}
