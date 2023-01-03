package CreationalDesignPatterns.AbstractFactory_DesignPattern;

public class SBI implements Bank {
    private final String BNAME;

    SBI() {
        BNAME = "SBI BANK";

    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
