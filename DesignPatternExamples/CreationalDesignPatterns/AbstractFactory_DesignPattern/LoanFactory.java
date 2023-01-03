package CreationalDesignPatterns.AbstractFactory_DesignPattern;

public class LoanFactory extends AbstractFatory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan.equalsIgnoreCase("Home"))
            return new HomeLoan();
        if (loan.equalsIgnoreCase("Business"))
            return new BusinessLoan();
        if (loan.equalsIgnoreCase("Education"))
            return new EducationLoan();
        return null;
    }
}
