import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mensagem inicial
        System.out.println("Bem-vindo ao verificador de número de conta!");
        
        System.out.println("Por favor, digite o número da conta. (precisa conter 8 dígitos)");
        try {
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);
            // TODO: Chamar o método que veritica se o número da conta é valido
            
            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
    

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            
            // "Numero de conta invalido. Digite exatamente 8 digitos."

            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");

        }
    }
}
