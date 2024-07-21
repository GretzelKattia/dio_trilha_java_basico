import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensagem inicial
        System.out.println("Bem-vindo ao Controle Simples de Saques!");
        System.out.println("Por favor, insira o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        System.out.println("Agora, insira os valores dos saques. Digite 0 para encerrar as transações.");

        // Loop for para iterar sobre os saques
        for (int i = 1; i <= limiteDiario ; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                double limiteRestante = limiteDiario - valorSaque;
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                System.out.println("Saque realizado. Limite restante: " + limiteRestante);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}