package CreationalDesignPatterns.Builder_DesignPattern;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }


}
