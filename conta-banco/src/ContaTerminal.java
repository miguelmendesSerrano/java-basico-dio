import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int account;

        String name, lastName, agency;

        double balance = 100;


        System.out.println("Digite seu nome: ");
        name = sc.next();

        System.out.println("Digite seu sobre nome: ");
        lastName = sc.next();

        System.out.println("Digite o numero da Agencia: ");
        agency = sc.next();

        System.out.println("Digite o numero da conta: ");
        account = sc.nextInt();

        System.out.printf("Ola, %s %s! Obrigado por criar uma conta em nosso banco, sua agencia e: %s, conta: %s e seu saldo: R$%.2f ja esta disponivel para saque.", name,lastName, agency, account, balance);

        sc.close();
    }
}
