package ChainOfResponsibilityPattern;

public class Request {
    private RequestPriority requestPrio;
    private String requestId;

    public Request( String id, RequestPriority prio ){
        this.requestId = id;
        this.requestPrio = prio;
    }

    public RequestPriority getPriority(){
        return this.requestPrio;
    }

    public String getRequestId(){
        return this.requestId;
    }
}
