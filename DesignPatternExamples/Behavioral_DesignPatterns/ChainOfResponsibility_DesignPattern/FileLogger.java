package Behavioral_DesignPatterns.ChainOfResponsibility_DesignPattern;

public class FileLogger extends GeneralLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard File Logger : " + message);
    }
}
