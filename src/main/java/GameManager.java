public class GameManager {
    private Game myGame;

    public GameManager(Game aGame) {
        this.myGame = aGame;
    }

    public int gameRounds(int [] speeds) {
        int cntRound = 0;
        for (int speed : speeds) {
            if (!this.myGame.isFailed(speed)){
                cntRound++;
            } else if (this.myGame.getIsGreenLight()) {
                cntRound++;
            }


        }
        return cntRound;
    }
}
