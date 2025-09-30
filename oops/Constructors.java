

class Constructors {
    int roll;
    String name;
    int age;

    Constructors() {  
        // this.name = "Arun Maity";
        // this.age = 22;
        this(5,"amit");  //calls parameterized constructor
    }

    

    Constructors (int roll, String name){ //parameterized constructor
        this.roll = roll;
        this.name = name;
    }

    Constructors (Constructors other){ //copy constructor
        this.name = other.name;
        this.roll = other.roll;
    }

    void changeName(String name){
        this.name = name;
    }

    void geetings(){
        System.out.println("tera nam hay "+name);
    }

    public static void main(String[] args) {
        // Constructors c = new Constructors(3,"Arun");
        // Constructors s = new Constructors(4,"Kunal");
        Constructors m = new Constructors();
        // c.changeName("tera nam");
        // c.geetings();
        // s.geetings();
        // System.out.println(s.roll);
        // System.out.println(c.name);
        System.out.println(m.roll);
    }
}