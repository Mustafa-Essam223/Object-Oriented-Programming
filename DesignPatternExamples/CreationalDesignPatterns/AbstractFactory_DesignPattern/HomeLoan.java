package CreationalDesignPatterns.AbstractFactory_DesignPattern;

public class HomeLoan extends Loan {
    @Override
    public void getInterestRate(double rate) {
        this.rate = rate;
    }
}
