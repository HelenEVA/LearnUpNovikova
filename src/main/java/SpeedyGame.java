public class SpeedyGame extends Game {

    private int maxSpeed;

    public SpeedyGame(boolean isGreenLight, int maxSpeed) {
        super(isGreenLight);
        this.maxSpeed = maxSpeed;

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        maxSpeed = newMaxSpeed;
    }

    @Override
    public boolean isFailed(int speed) {
        if (this.getIsGreenLight()) {
                //System.out.println("Игрок проходит");
            return true;
        } else {
//            System.out.println(speed + " >= " + maxSpeed);

            if (speed > maxSpeed) {
                //System.out.println("Игрок проиграл");
                return true;
            } else {
                //System.out.println("Игрок проходит");
                return false;
            }

        }
    }
}
