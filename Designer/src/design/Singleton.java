package design;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton () {}
    public static Singleton getSingleton () {
        if (singleton == null) {
            System.out.println("=====执行=====");
            singleton = new Singleton();
        }
        return singleton;
    }
}
