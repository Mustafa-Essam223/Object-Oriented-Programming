package Behavioral_DesignPatterns.ChainOfResponsibility_DesignPattern;

public abstract class GeneralLogger {
    public static int INFO=1;
    public static int DEBUG=2 ;
    public static int ERROR=3 ;
    protected int level;
    protected GeneralLogger NextLogger ;
    public void setNextLogger(GeneralLogger Logger)
    {
        this.NextLogger=Logger ;
    }
    public void LogMessage(int level,String msg) {
        if (this.level <= level)
            write(msg);
        if (NextLogger == null)
            NextLogger.LogMessage(level, msg);

    }

    protected abstract void write(String message);

}
