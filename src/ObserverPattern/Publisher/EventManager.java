package ObserverPattern.Publisher;

import java.io.File;
import java.util.*;
import ObserverPattern.Listeners.EventListener;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager( String... operations ){
        for( String operation : operations ){
            this.listeners.put( operation, new ArrayList<>() );
        }
    }

    public void subscribe( String eventType, EventListener listener ){
        List<EventListener> subscribers = this.listeners.get( eventType );
        subscribers.add( listener );
    }

    public void unsubscribe( String eventType, EventListener listener ){
        List<EventListener> subscribers = this.listeners.get( eventType );
        subscribers.remove( listener );
    }

    public void notify( String eventType, File file ){
        List<EventListener> subscribers = this.listeners.get( eventType );
        for( EventListener subscriber : subscribers ){
            subscriber.sendNotif( eventType, file );
        }
    }
}
