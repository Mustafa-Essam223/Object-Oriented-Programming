package Behavioral_DesignPatterns.ChainOfResponsibility_DesignPattern;

public class ErrorLogger extends GeneralLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Error Logger : " + message);

    }
}
