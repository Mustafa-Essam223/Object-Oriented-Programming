package CreationalDesignPatterns.Builder_DesignPattern;

public class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public float getPrice() {
        return 35f;
    }
}
