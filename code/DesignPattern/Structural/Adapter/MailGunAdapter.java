package code.DesignPattern.Structural.Adapter;

import code.DesignPattern.Structural.Adapter.libraries.MailGun;

public class MailGunAdapter implements EmailAdapter{
    MailGun client=new MailGun();
    @Override
    public void sendEmail(String to, String from, String content) {
        client.sendEmail(to,from,content,null,null);
    }
}
