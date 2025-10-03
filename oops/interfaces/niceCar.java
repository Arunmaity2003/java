package oops.interfaces;

class niceCar {
    private Brake brake;
    private media player = new cdPlayer();

    public niceCar(){
        brake = new newBrake();
    }

    public niceCar (Brake brake){
        this.brake = brake;
    }

    public void brake(){
        brake.brake();
    }

    public void music(){
        player.start();
    }
}