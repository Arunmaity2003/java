package oops.interfaces;

class Car implements Brake,media{

    @Override
    public void brake(){
        System.out.println("bake like a pro");
    }

    @Override
    public void start(){
        System.out.println("start like a pro");
    }

    @Override
    public void stop(){
        System.out.println("stop like a pro");
    }
}