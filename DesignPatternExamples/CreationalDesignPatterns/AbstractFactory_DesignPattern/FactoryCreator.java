package CreationalDesignPatterns.AbstractFactory_DesignPattern;

public class FactoryCreator {
    public static AbstractFatory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank"))
            return new Bankfactory();
        if (choice.equalsIgnoreCase("Loan"))
            return new LoanFactory();
        return null;
    }
}
