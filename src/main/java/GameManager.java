public class GameManager {
    private Game myGame;

    public GameManager(Game aGame) {
        this.myGame = aGame;
    }

    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        int roundReturn = 0;
        for (int i = 0; i < rounds+1; i++) {
            if (this.myGame.isFailed(p1.getSpeed())){
                roundReturn= -1;
                break;
            }
            if (this.myGame.isFailed(p2.getSpeed())){
                roundReturn= 1;
                break;
            }
        }
        return roundReturn;
    }
}
