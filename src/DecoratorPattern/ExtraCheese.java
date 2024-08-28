package DecoratorPattern;

public class ExtraCheese extends PizzaTopping {
    public ExtraCheese( Pizza basePizza ){
        super( basePizza );
    }

    @Override
    public int cost() {
        return super.cost() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + ExtraCheese";
    }
}
