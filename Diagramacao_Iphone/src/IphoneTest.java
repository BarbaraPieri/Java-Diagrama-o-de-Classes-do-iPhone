public class IphoneTest {
    public static void main(String[] args) {
        // Crie uma instância de IPhone
        IPhone iphone = new IPhone();

        // Teste a funcionalidade de Reprodutor Musical
        iphone.reproduzirMusica("Música 1");
        iphone.pausarMusica();
        iphone.avancarMusica();
        iphone.retrocederMusica();

        // Teste a funcionalidade do Aparelho Telefônico
        iphone.fazerLigacao("123-456-789");
        iphone.receberLigacao("987-654-321");
        iphone.encerrarLigacao();
        iphone.enviarMensagem("Amigo", "Olá, como você está?");
        iphone.receberMensagem("Família", "Estamos bem!");

        // Teste a funcionalidade do Navegador na Internet
        iphone.abrirPaginaWeb("https://www.example.com");
        iphone.navegarAtras();
        iphone.navegarAdiante();
        iphone.atualizarPagina();
        iphone.fecharPaginaWeb();
    }
}
