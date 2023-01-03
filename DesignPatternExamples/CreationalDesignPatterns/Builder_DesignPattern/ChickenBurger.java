package CreationalDesignPatterns.Builder_DesignPattern;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public float getPrice() {
        return 80.0f;
    }
}
