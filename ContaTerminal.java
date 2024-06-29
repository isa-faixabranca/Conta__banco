import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Qual a sua agência?");
        String agencia = scanner.nextLine();

        System.out.println("Qual o número da sua conta?");
        int conta = scanner.nextInt();
        scanner.nextLine();  
       
        System.out.println("Qual o seu nome?");
        String cliente = scanner.nextLine();

        System.out.println("Quanto deseja depositar de saldo inicial?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo já está disponível para o saque.");

       
        scanner.close();
    }
}
