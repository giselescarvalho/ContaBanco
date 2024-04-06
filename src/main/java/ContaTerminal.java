import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldoConta;

        System.out.println("Olá!");

        System.out.println("Entre com o número da conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Entre com a agência: ");
        agencia = sc.nextLine();

        System.out.println("Entre com o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Entre com o saldo: ");
        saldoConta = sc.nextFloat();

        sc.close();

    }
}
