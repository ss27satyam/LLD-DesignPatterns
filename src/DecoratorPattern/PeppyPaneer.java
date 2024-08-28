package DecoratorPattern;

public class PeppyPaneer implements Pizza {
    @Override
    public String getDescription() {
        return "PeppyPaneer";
    }

    @Override
    public int cost(){
        return 200;
    }
}
