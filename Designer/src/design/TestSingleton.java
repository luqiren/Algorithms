package design;

public class TestSingleton {
    public static void main (String[] args) {
        String s1 = null;
        SingletonThread s = new SingletonThread();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
        new Thread(s).start();
    }
}
