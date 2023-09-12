import java.util.Locale;
import java.util.Scanner;

public class Banco {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        
        int conta;
        String agencia;
        String nomeCliente;
        double saldoConta;

        System.out.println("Digite o número da conta: ");
        conta = sc.nextInt();
    
        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.next();

        System.out.println("Digite o seu nome: ");
        nomeCliente = sc.next();

        sc.nextLine();

        System.out.println("Digite o saldo: ");
        saldoConta = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência " + agencia + ", conta " + conta + " e seu saldo " + saldoConta + " já está disponível para saque.");


    }
}
