import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mensagem inicial
        System.out.println("Bem-vindo ao sistema de criação de contas!");
        
        System.out.println("Por favor, antes de criar a conta, poderia nos informar sua idade?");
        int idade = scanner.nextInt();

        // TODO: Verificar se a idade do cliente
        // TODO: Se >= 18, imprimir "Voce esta elegivel para criar uma conta bancaria."
        // TODO: Caso contrário, imprimir "Voce nao esta elegivel para criar uma conta bancaria."
        if (idade >= 18) {
           System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }
        else {
          System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}