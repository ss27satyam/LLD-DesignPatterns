package ChainOfResponsibilityPattern;

public interface SupportHandler {
    void setNextHandler( SupportHandler handler );
    void handleRequest( Request request );
}
