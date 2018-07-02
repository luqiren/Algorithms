package design;

import java.util.HashSet;
import java.util.Set;

public class SingletonThread implements Runnable {
    public Set<Singleton> sets = new HashSet<Singleton>();

    @Override
    public void run() {
        Singleton singleton = Singleton.getSingleton();
        sets.add(singleton);
        System.out.println("set的大小是:"+sets.size());
    }
}
