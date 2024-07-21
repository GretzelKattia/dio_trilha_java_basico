import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensagem inicial
        System.out.println("Bem-vindo ao sistema de verificação de cheque especial!");

        System.out.println("Por favor, insira o valor do seu saldo:");
        double saldo = scanner.nextDouble();

        System.err.println("Okay, agora informe qual o valor do saque realizado?");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;
        double saqueComChequeEspecial = saldo + limiteChequeEspecial;
        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
          System.out.println("Transação realizada com sucesso.");
            // TODO: Imprimir "Transação realizada com sucesso."
        } else {
            String mensagem = saqueComChequeEspecial > saque 
            ? "Transação realizada com sucesso utilizando o cheque especial."
            : "Transação não realizada. Limite do cheque especial excedido.";
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
            System.out.println(mensagem);
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}