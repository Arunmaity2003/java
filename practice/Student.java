
class Student {

    String name;
    static String collegeName;

    public Student(String name) {
        this.name = name;
    }

    static {
        collegeName = "ABC college";
        System.out.println("Static block executed");
    }

    void display() {
        System.out.println("Name: " + name + "College: " + collegeName);
    }

    {
        System.out.println("Instance block executed");
    }

    public static void main(String[] args) {
        Student arun = new Student("Arun");
        Student kunal = new Student("kunal");
        arun.display();
        kunal.display();
    }
}
