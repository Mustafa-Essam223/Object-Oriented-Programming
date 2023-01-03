package CreationalDesignPatterns.AbstractFactory_DesignPattern;

public class Bankfactory extends AbstractFatory {
    @Override
    public Bank getBank(String bank) {
        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFS();
//        } else if (bank.equalsIgnoreCase("ICICI")) {
//            return new ICICI();
        } else if (bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        }

        return null;
    }


    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
