package CreationalDesignPatterns.AbstractFactory_DesignPattern;

public abstract class AbstractFatory {
    public abstract Bank getBank(String bank);

    public abstract Loan getLoan(String loan);
}
