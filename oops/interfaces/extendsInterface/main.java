package oops.interfaces.extendsInterface;

class main implements b{
    @Override
    public void run(){
        System.out.println("run faster");
    }

    @Override
    public void fun(){
        System.out.println("too much fun");
    }

    public static void main(String[] args) {
        main m = new main();
        a.greeting();
    }
}