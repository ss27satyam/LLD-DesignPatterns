package DecoratorPattern;

public class FarmHouse implements Pizza {
    @Override
    public String getDescription() {
        return "FarmHouse";
    }

    @Override
    public int cost() {
        return 150;
    }
}
