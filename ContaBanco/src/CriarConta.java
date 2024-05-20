import java.util.Locale;
import java.util.Scanner;

public class CriarConta {
    int conta;
    String agencia;
    String primeiro_Nome;
    String sobrenome;
    double saldo;

    public void novaConta(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Por favor, digite seu primeiro nome: ");
            primeiro_Nome = scanner.next();
            System.out.println("Por favor, digite seu sobrenome: ");
            sobrenome = scanner.next();
            System.out.println("Por favor, digite o número da sua conta: ");
            conta = scanner.nextInt();
            System.out.println("Por favor, digite o número de sua Agência: ");
            agencia = scanner.next();
            System.out.println("Para validar sua conta você deve fazer um deposito acima de R$10,00 reais.");
            System.out.println("Esse valor ficará disponível na CC para interações (saques, compras, investimentos, e etc).");
            System.out.println("Informe o valor que você deseja deposiar: ");
            saldo = scanner.nextDouble();
    }
    
}
