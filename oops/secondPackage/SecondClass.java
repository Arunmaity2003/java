package secondPackage;

// import classes from another package
import packages.com.arun.example;
import packages.com.arun.pack;

public class SecondClass {
    public static void main(String[] args) {
        // using class from packages.com.arun
        example e = new example(25);
        e.show();

        pack p = new pack();
        p.message();
    }
}
