
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {

    @Override
    public void reproduzirMusica(String musica) {
        // Implementação para reproduzir música
        System.out.println("Reproduzindo a música: " + musica);
    }

    @Override
    public void pausarMusica() {
        // Implementação para pausar a música
        System.out.println("Música pausada.");
    }

    @Override
    public void avancarMusica() {
        // Implementação para avançar a música
        System.out.println("Avançando para a próxima música.");
    }

    @Override
    public void retrocederMusica() {
        // Implementação para retroceder a música
        System.out.println("Retrocedendo para a música anterior.");
    }

    @Override
    public void fazerLigacao(String numero) {
        // Implementação para fazer uma ligação
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void receberLigacao(String numero) {
        // Implementação para receber uma ligação
        System.out.println("Recebendo ligação de: " + numero);
    }

    @Override
    public void encerrarLigacao() {
        // Implementação para encerrar uma ligação
        System.out.println("Ligação encerrada.");
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        // Implementação para enviar mensagem
        System.out.println("Enviando mensagem para " + destinatario + ": " + mensagem);
    }

    @Override
    public void receberMensagem(String remetente, String mensagem) {
        // Implementação para receber mensagem
        System.out.println("Mensagem recebida de " + remetente + ": " + mensagem);
    }

    @Override
    public void abrirPaginaWeb(String url) {
        // Implementação para abrir uma página web
        System.out.println("Abrindo a página web: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        // Implementação para fechar a página web
        System.out.println("Fechando a página web.");
    }

    @Override
    public void navegarAtras() {
        // Implementação para navegar para trás na página web
        System.out.println("Navegando para trás na página web.");
    }

    @Override
    public void navegarAdiante() {
        // Implementação para navegar para a frente na página web
        System.out.println("Navegando para a frente na página web.");
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página web
        System.out.println("Atualizando a página web.");
    }
}
