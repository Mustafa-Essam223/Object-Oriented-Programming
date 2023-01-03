package CreationalDesignPatterns.Builder_DesignPattern;

public interface Item {
    public String getName();

    public Packing packing();

    public float getPrice();
}
