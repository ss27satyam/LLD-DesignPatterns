package ObserverPattern.Listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener( String email ){
        this.email = email;
    }

    @Override
    public void sendNotif(String eventType, File file){
        System.out.println("Email sent to : " + email + " : Someone has performed " + eventType + " operation with the file: " + file.getName() );
    }
}
