package Behavioral_DesignPatterns.ChainOfResponsibility_DesignPattern;

public class ConsoleLogger extends GeneralLogger{
    public ConsoleLogger(int level)
    {
        this.level=level ;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard Console Logger : " + message);

    }
}
