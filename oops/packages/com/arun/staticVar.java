package packages.com.arun;

class staticVar {
    int age;
    String name;
    static long population;

    public staticVar(int age,String name) {
        this.age = age;
        this.name = name;
        staticVar.population += 1;
    }
    
}