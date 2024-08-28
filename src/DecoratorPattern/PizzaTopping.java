package DecoratorPattern;

public abstract class PizzaTopping implements Pizza {
    protected Pizza basePizza;

    public PizzaTopping( Pizza basePizza ){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost();
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription();
    }
}
