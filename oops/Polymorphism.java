//Start with basics--------

// public class Polymorphiam {
//     public int add(int a){
//         return a+a;
//     }
//     public int add(int a,int b){
//         return a+b;
 
//     }

//     public static void main(String[] args) {
//         Polymorphiam p = new Polymorphiam();

//         int result = p.add(2);
//         int result2 = p.add(3, 9);
//         System.out.println(result);
//         System.out.println(result2);
//     }
// }

//runtime polymorphism-------------

class Animal {
    public void makeSound(){
        System.out.println("Animal make sound.");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat mewu");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}