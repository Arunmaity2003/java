package oops.inheritance;

class main {
    public static void main(String[] args) {
        box box1 = new box(7,9.8,7);
        box box2 = new box(box1);
        System.out.println(box1.w+" "+box2.w);

        // boxWeight box3 = new boxWeight(2,6,3,8);
        // boxWeight box4 = new boxWeight();
        // System.out.println(box3.h);
    }
}