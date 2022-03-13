import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    @Test

    public void shouldLoserP1() {

        Game game = new Game(false);
        GameManager gm = new GameManager(game);

        ConstantPlayer p1 = new ConstantPlayer(123);
        FastPlayer p2 = new FastPlayer(10, 5);

        int expected = -1;
        int actual = gm.loser(p1, p2, game, 10);

        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void shouldLoserP2() {

        Game game = new Game(false);
        GameManager gm = new GameManager(game);

        ConstantPlayer p1 = new ConstantPlayer(0);
        FastPlayer p2 = new FastPlayer(13, 5);

        int expected = 1;
        int actual = gm.loser(p1, p2, game, 10);

        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void shouldNotLoser() {

        Game game = new Game(false);
        GameManager gm = new GameManager(game);

        ConstantPlayer p1 = new ConstantPlayer(0);
        FastPlayer p2 = new FastPlayer(0, 5);

        int expected = 0;
        int actual = gm.loser(p1, p2, game, 10);

        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void shouldNotLoserIsGreenLightTrue() {

        Game game = new Game(true);
        GameManager gm = new GameManager(game);

        ConstantPlayer p1 = new ConstantPlayer(120);
        FastPlayer p2 = new FastPlayer(50, 5);

        int expected = 0;
        int actual = gm.loser(p1, p2, game, 10);

        Assertions.assertEquals(expected,actual);

    }


}
