package oops.cloning;

import java.util.Arrays;

class main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human arun = new Human(22, "arun");
        // Human twin = new Human(arun);
        Human twin = (Human) arun.clone();
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));

        System.out.println(Arrays.toString(arun.arr));

        System.out.println(twin.age + " " + twin.name);
    }
}
