package DecoratorPattern;

public class PizzaShop {
    public static void main( String[] args ){
        Pizza pizza = new PeppyPaneer();
        System.out.println( "Ordering Pizza : " + pizza.getDescription() + ", Total Amount : " + pizza.cost() );
        System.out.println("======================================================================================");

        pizza = new ExtraCheese( pizza );
        System.out.println( "Ordering Pizza : " + pizza.getDescription() + ", Total Amount : " + pizza.cost() );
        System.out.println("======================================================================================");

        pizza = new Mushroom( pizza );
        System.out.println( "Ordering Pizza : " + pizza.getDescription() + ", Total Amount : " + pizza.cost() );
        System.out.println("======================================================================================");

        pizza = new FarmHouse();
        System.out.println( "Ordering Pizza : " + pizza.getDescription() + ", Total Amount : " + pizza.cost() );
    }
}
