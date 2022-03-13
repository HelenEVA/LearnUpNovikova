public class FastPlayer implements Movable{
    int speed= 0;
    int startSpeed;
    int speedStep;

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    public int getSpeed(){
        if (speed == 0){
            speed = startSpeed;
        } else {
            speed = speed + speedStep;
        }
        return speed;
    }

}
