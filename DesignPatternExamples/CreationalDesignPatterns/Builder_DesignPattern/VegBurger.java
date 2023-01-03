package CreationalDesignPatterns.Builder_DesignPattern;

public class VegBurger extends Burger {


    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public float getPrice() {
        return 100.0f;
    }
}
