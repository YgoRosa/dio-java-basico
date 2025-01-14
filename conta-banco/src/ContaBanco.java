import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu número: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); //consome o \n deixando pelo nextInt

        System.out.println("Digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}