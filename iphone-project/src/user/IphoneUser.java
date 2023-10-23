package user;

import smartphone.Iphone;

public class IphoneUser {
    public static void main(String[] args) {
        Iphone iphone14 = new Iphone();

        System.out.println("Testando o app Phone:");
        iphone14.call();
        iphone14.answerCall();
        iphone14.startVoiceMail();
        System.out.println();

        System.out.println("Testando o app Browser:");
        iphone14.viewPage();
        iphone14.refreshPage();
        iphone14.addNewTab();
        System.out.println();

        System.out.println("Testando o app Music Player:");
        iphone14.playMusic();
        iphone14.pauseMusic();
        iphone14.selectMusic();
    }
}
