import br.com.rodrigoduartesilva.model.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o nome do cliente: ");
        conta.setNomeDoCliente(scanner.next());

        System.out.println("Por favor, digite o número da agência: ");
        conta.setAgencia(scanner.next());

        System.out.println("Por favor, digite o número da conta do cliente: ");
        conta.setNumeroConta(scanner.nextInt());

        System.out.println("Por favor, digite o saldo da conta: ");
        conta.setSaldo(scanner.nextDouble());

        conta.exibirDadosDaConta();
    }
}