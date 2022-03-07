public class Game {

    private boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getIsGreenLight() {
        return isGreenLight;
    }

    public void setIsGreenLight(boolean newIsGreenLight) {
        isGreenLight = newIsGreenLight;

    }

    public boolean isFailed(int speed) {

        if (isGreenLight) {
                //System.out.println("Игрок проходит");
            return true;
        } else {
            if (speed > 0) {
//                System.out.println("Игрок проиграл");
                return true;
            } else {
//                System.out.println("Игрок проходит");
                return false;
            }

        }

    }

}
