import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine(); 

        System.out.print("Digite o nome do cliente: ");
        String nome_cliente = scanner.nextLine();

        double saldo = 237.48;
        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}

