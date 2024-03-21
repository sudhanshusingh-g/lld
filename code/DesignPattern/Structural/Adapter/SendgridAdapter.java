package code.DesignPattern.Structural.Adapter;

import code.DesignPattern.Structural.Adapter.libraries.Sendgrid;

public class SendgridAdapter implements EmailAdapter{

    Sendgrid client=new Sendgrid();
    @Override
    public void sendEmail(String to, String from, String content) {
        client.sendEmail(to,from,content,null,null);
    }
}
