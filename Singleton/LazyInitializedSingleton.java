package Singleton;

/**
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
 * Only fine in case of the single-threaded environment
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
