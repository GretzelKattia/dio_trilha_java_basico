import java.util.Scanner;

public class Contador {
    // private static int contagem;
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            // Mensagem explicativa
            System.out.println("Bem-vindo ao programa Contador!");
            System.out.println("Você precisará digitar dois números inteiros.");
            System.out.println("O segundo número deve ser maior que o primeiro.");
            System.out.println("O programa irá contar e imprimir os números entre eles.");


            System.out.printf("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.printf("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            
            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());

            }

        } finally {
            // fechando o Scanner
                terminal.close();
        }
            
    }

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

	
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            try {
                Thread.sleep(500); // 1000 milissegundos = 1 segundo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("O time foi interrompida");
            }
            System.err.println("Imprimindo o número " + i);
        }
	}
}