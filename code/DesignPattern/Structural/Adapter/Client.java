package code.DesignPattern.Structural.Adapter;

import code.DesignPattern.Structural.Adapter.libraries.Sendgrid;

public class Client {
    public static void main(String[] args) {
//        EmailHelper emailHelper=new EmailHelper(new SendgridAdapter());
//        emailHelper.sendEmail("eamil@email.com","admin@admin","Regards");
        EmailHelper emailHelper=new EmailHelper(new MailGunAdapter());
        emailHelper.sendEmail("eamil@email.com","admin@admin","Regards");
    }
}
