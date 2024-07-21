public class Teste {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        meuIphone.ligar("123456789");
        meuIphone.atender("123456789");
        meuIphone.iniciarCorreioVoz("Olá, deixe sua mensagem após o bip.", "123456789");

        meuIphone.exibirPagina("http://lalala.com");
        meuIphone.adicionarNovaAba("http://tarara.com");
        meuIphone.atualizarPagina();

        meuIphone.selecionarMusica("Sugar - Maroon 5");
        meuIphone.tocar();
        meuIphone.pausar();
    }
}
