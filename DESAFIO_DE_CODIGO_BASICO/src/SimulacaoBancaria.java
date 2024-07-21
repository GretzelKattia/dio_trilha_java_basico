import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        // Mensagem inicial
        System.out.println("Bem-vindo ao sistema de simulação bancária!");
        System.out.println("Escolha uma opção:\n 1-Depositar\n 2-Sacar\n 3-Ver Saldo\n 4-Sair");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser Depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    // 1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
                    break;
                case 2:
                    System.out.println("Digite o valor a ser retirado: ");
                    double valorSaque = scanner.nextDouble();
                    if(saldo > valorSaque){
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    } else{
                        System.out.println("Saldo insuficiente.");
                    }
                    //2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."

                    break;
                case 3:
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    // 3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}