package ChainOfResponsibilityPattern;

public class P3SupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if( request.getPriority() == RequestPriority.Basic ){
            System.out.println( "Handling Request " + request.getRequestId() + " with Basic priority." );
        } else if ( nextHandler != null ) {
            nextHandler.handleRequest( request );
        }
    }
}
