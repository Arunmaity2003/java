package oops.interfaces;

class cdPlayer implements media{
    @Override
    public void start(){
        System.out.println("cd player start");
    }

    @Override
    public void stop(){
        System.out.println("cd player stop");
    }
}