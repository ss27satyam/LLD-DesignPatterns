package ChainOfResponsibilityPattern;

public class DemoClient {
    public static void main( String[] args ){
        SupportHandler handler1 = new P1SupportHandler();
        SupportHandler handler2 = new P2SupportHandler();
        SupportHandler handler3 = new P3SupportHandler();

        handler1.setNextHandler( handler2 );
        handler2.setNextHandler( handler3 );

        Request request1 = new Request("ttt", RequestPriority.Basic);
        Request request2 = new Request("ppp", RequestPriority.Intermediate);
        Request request3 = new Request("sss", RequestPriority.Urgent);

        handler3.handleRequest( request1 );
        handler1.handleRequest( request2 );
        handler1.handleRequest( request3 );
    }
}
