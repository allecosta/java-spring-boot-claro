package iphone.test;

import iphone.main.Iphone;

public class IphoneTest {
    public static void main(String[] args) {
        
        Iphone test = new Iphone();

        test.addNewTab();
        test.viewPage("http://web.dio.me");
        test.answer();
        test.pause();
        test.refreshPage();
        test.selectMusic("A vida é assim");
        test.start("(81) 9900-0099");
        test.startVoicemail();
        test.touch();
    }

}
