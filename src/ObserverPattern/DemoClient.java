package ObserverPattern;

import ObserverPattern.Listeners.EmailNotificationListener;
import ObserverPattern.Listeners.LogOpenListener;
import ObserverPattern.editor.Editor;

public class DemoClient {
    public static void main( String[] args ){
        Editor editor = new Editor();

        editor.eventManager.subscribe("open", new LogOpenListener("/path/to/log/file.txt" ) );
        editor.eventManager.subscribe( "save", new EmailNotificationListener( "abc@example.com" ) );

        try {
            editor.openFile("test.txt" );
            editor.saveFile();
        } catch ( Exception e ){
            e.printStackTrace();
        }
    }
}
