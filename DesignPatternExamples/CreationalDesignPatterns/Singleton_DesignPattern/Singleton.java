package CreationalDesignPatterns.Singleton_DesignPattern;

public class Singleton {
    private static Singleton object;
    private String single_phrase;

    private Singleton() {
        this.single_phrase = "First String";
    }

    public static Singleton getInstance() {
        return (object == null) ? new Singleton() : object;
    }

    public static void FinishInstance() {
        object = null;
    }

    public String getSingle_phrase() {
        return single_phrase;
    }

    public void setSingle_phrase(String single_phrase) {
        this.single_phrase = single_phrase;
    }
}
