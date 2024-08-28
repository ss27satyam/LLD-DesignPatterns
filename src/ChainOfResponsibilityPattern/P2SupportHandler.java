package ChainOfResponsibilityPattern;

public class P2SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if( request.getPriority() == RequestPriority.Intermediate ){
            System.out.println( "Handling Request " + request.getRequestId() + " with Intermediate priority." );
        } else if ( nextHandler != null ) {
            nextHandler.handleRequest( request );
        }
    }
}
