public class ConstantPlayer implements Movable{
    int playerSpeed;

    public ConstantPlayer(int playerSpeed) {
        this.playerSpeed = playerSpeed;
    }

    public int getSpeed(){
        return playerSpeed;
    }
}