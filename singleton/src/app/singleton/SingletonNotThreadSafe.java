package app.singleton;

/**
 * SingletonNotThreadSafe
 */
public class SingletonNotThreadSafe {

    private static SingletonNotThreadSafe instance;

    private SingletonNotThreadSafe() {}

    public static SingletonNotThreadSafe getInstance() {
        if(instance == null) {
            instance = new SingletonNotThreadSafe();
        }

        return instance;
    }
}