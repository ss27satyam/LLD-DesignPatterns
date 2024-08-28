package DecoratorPattern;

public class Mushroom extends PizzaTopping {
    public Mushroom( Pizza basePizza ){
        super( basePizza );
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " , Mushroom";
    }

    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
