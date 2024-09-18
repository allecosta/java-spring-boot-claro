package iphone.main;

import iphone.main.Ipod;
import iphone.main.Phone;
import iphone.main.Internet;

public class Iphone implements Ipod, Phone, Internet {

    @Override
    public void touch() {
        System.out.println("Tocando...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecionando música...");
    }

    @Override
    public void start(String number) {
        System.out.println("Conectando...");
    }
    
    @Override
    public void answer() {
        System.out.println("Atendendo...");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void viewPage(String url) {
        System.out.println("Exibindo página...");

    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página");
    }

}
