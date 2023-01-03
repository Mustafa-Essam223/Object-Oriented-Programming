package Behavioral_DesignPatterns.Command_DesignPattern;

public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock)
    {
        this.abcStock=abcStock ;
    }

    @Override
    public void Execute() {
        abcStock.sell();
    }
}
