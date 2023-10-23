package smartphone;

import apps.Browser;
import apps.MusicPlayer;
import apps.Phone;

public class Iphone implements MusicPlayer, Browser, Phone {

    public void playMusic() {
        System.out.println("Tocando musica no Iphone...");
    }

    public void pauseMusic() {
        System.out.println("Pausando musica no Iphone...");
    }

    public void selectMusic() {
        System.out.println("Selecionando musica no Iphone...");
    }

    public void addNewTab() {
        System.out.println("Adicionando nova aba no Iphone...");
    }

    public void refreshPage() {
        System.out.println("Atualizando pagina no Iphone");
    }

    public void viewPage() {
        System.out.println("Exibindo pagina no Iphone...");
    }

    public void call() {
        System.out.println("Fazendo ligacao no Iphone...");
    }

    public void answerCall() {
        System.out.println("Atendendo ligacao no Iphone...");
    }

    public void startVoiceMail() {
        System.out.println("Iniciando correio de voz no Iphone...");
    }
}
