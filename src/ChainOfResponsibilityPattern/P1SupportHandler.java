package ChainOfResponsibilityPattern;

public class P1SupportHandler implements SupportHandler {
    SupportHandler nextHandler;

    @Override
    public void setNextHandler( SupportHandler handler ) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest( Request request ) {
        if( request.getPriority() == RequestPriority.Urgent ){
            System.out.println( "Handling Request " + request.getRequestId() + " with Urgent priority." );
        } else if ( nextHandler != null ) {
            nextHandler.handleRequest( request );
        }
    }
}
