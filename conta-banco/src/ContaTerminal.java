import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o saldo inicial:");
            double saldo = scanner.nextDouble();

            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, verifique se os tipos de dados inseridos estão corretos.");
        } finally {
            scanner.close();
        }
    }
}

