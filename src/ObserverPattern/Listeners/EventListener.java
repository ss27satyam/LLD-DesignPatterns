package ObserverPattern.Listeners;

import java.io.File;

public interface EventListener {
    public void sendNotif(String eventType, File file );
}
