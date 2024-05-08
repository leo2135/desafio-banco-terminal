import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o nome do Cliente: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Digite a agência: ");
        agencia = entrada.nextLine();

        System.out.println("Digite o numero da conta: ");
        conta = entrada.nextInt();

        System.out.println("Digite o Saldo ");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque ");
    }
}
