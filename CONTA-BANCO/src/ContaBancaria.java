import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        System.out.println("Muito bem, hoje eu irei ajudar você a enviar uma mensagem para uma nova pessoa que se cadastrar no nosso banco, okay?");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro vamos digitar qual agencia ela vai pertencer (ex: 067-8)");
        String agencia = scanner.nextLine();

        System.out.println("Okay, agora digite qual o número da agência que vamos inserir ela? (ex: 1021)");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Beleza, não esquece de colocar o nome do cliente, viu?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Agora só precisa adicionar o saldo da conta dela?");
        double saldo = scanner.nextDouble();

        System.out.println("Prontinho! Agora podemos enviar essa mensagem para o email dela");

        // Exibir a mensagem final formatada como um e-mail
        System.out.println("\n==============================");
        System.out.println("Assunto: Bem-vindo ao Banco Larara!");
        System.out.println("==============================\n");

        String mensagem = String.format("Olá %s,\n\nObrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.\n\n", nomeCliente, agencia, numeroAgencia, saldo);

        System.out.println(mensagem);
        System.out.println("Tenha um ótimo dia e aproveite nossos serviços!\n");

        System.out.println("==============================");

        scanner.close();


    }
}
