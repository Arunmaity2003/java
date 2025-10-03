package oops.interfaces;

class extraBrake implements Brake{
    @Override
    public void brake(){
        System.out.println("Extra bake is working ...");
    }
}