package oops.inheritance;

class box {
    double l;
    double h;
    double w;

    box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    box(double s){
        this.l = s;
        this.h = s;
        this.w = s;
    }

    box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    box(box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void info(){
        System.out.println("I am a information.");
    }
    
}