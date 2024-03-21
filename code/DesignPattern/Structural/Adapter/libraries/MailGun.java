package code.DesignPattern.Structural.Adapter.libraries;

public class MailGun {
    public void sendEmail(String to,String from,String content,String[] cc,String[] bcc){
        System.out.println("Sending email through mailgun");
    }
}
