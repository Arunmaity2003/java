class Singleton {
    // Step 1: create a private static instance
    private static final Singleton instance = new Singleton();

    // Step 2: make constructor private (so no one can use `new`)
    private Singleton() {
        System.out.println("Singleton object created!");
    }

    // Step 3: provide a global access point
    public static Singleton getInstance() {
        return instance;
    }
}

public class singletoneClass {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2); // true (same object)
    }
}
