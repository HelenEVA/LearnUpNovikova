import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    @Test

    public void shouldIsFailed() {

        Game game = new Game(false);

        Assertions.assertTrue(game.isFailed(8));

    }

    @Test

    public void shouldGameRoundsIsGame() {

        Game game = new Game(false);
        GameManager gm = new GameManager(game);

        int[] speeds = {17, 5, 0};

        int expected = 1;
        int actual = gm.gameRounds(speeds);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldGameRoundsIsGameIsGreenLightTrue() {

        Game game = new Game(true);
        GameManager gm = new GameManager(game);

        int[] speeds = {17, 5, 0};

        int expected = 3;
        int actual = gm.gameRounds(speeds);

        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void shouldGameRoundsIsSpeedyGame(){

        Game gameS = new SpeedyGame(false, 14);
        GameManager gmS = new GameManager(gameS);

        int[] speeds = {17, 5, 0};

        int expected = 2;
        int actual = gmS.gameRounds(speeds);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldGameRoundsMaxSpeed0(){

        Game gameS = new SpeedyGame(false, 0);
        GameManager gmS = new GameManager(gameS);

        int[] speeds = {17, 5, 0};

        int expected = 1;
        int actual = gmS.gameRounds(speeds);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldGameRoundsIsGreenLightTrue(){

        Game gameS = new SpeedyGame(true, 14);
        GameManager gmS = new GameManager(gameS);

        int[] speeds = {17, 5, 0};

        int expected = 3;
        int actual = gmS.gameRounds(speeds);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldGameRoundsIsGreenLightTruMaxSpeed0(){

        Game gameS = new SpeedyGame(true, 0);
        GameManager gmS = new GameManager(gameS);

        int[] speeds = {17, 5, 0};

        int expected = 3;
        int actual = gmS.gameRounds(speeds);

        Assertions.assertEquals(expected, actual);

    }


}
