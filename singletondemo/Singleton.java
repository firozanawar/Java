package singletondemo;

public class Singleton {

    private static Singleton instance = null;

    public String s;

    private Singleton() {
        s = "Hi I am variale in singleton";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
