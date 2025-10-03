package oops.interfaces;

class bike implements Brake,media{
    @Override
    public void brake(){
        System.out.println("Brake the bike");
    }

    @Override
    public void start(){
        System.out.println("Start the bike ");
    }

    @Override
    public void stop(){
        System.out.println("stop the bike");
    }
}