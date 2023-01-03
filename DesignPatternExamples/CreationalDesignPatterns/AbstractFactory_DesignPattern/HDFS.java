package CreationalDesignPatterns.AbstractFactory_DesignPattern;

public class HDFS implements Bank {
    private final String BNAME;

    public HDFS() {
        BNAME = "HDFC Bank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
