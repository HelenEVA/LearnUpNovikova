import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {
    @Test

    public void shouldIsFailed() {

        SpeedyGame speedyGame = new SpeedyGame(true, 10);

        Assertions.assertTrue(speedyGame.isFailed(8));

    }

    @Test

    public void shouldIsFailedForSpeed0() {

        SpeedyGame speedyGame = new SpeedyGame(true, 10);

        Assertions.assertTrue(speedyGame.isFailed(0));

    }

    @Test

    public void shouldIsFailedFalseLimitValue11() {

        SpeedyGame speedyGame = new SpeedyGame(false, 10);

        boolean expected = true;
        boolean actual = speedyGame.isFailed(11);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIsFailedFalseLimitValue9() {

        SpeedyGame speedyGame = new SpeedyGame(false, 10);

        boolean expected = false;
        boolean actual = speedyGame.isFailed(9);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIsFailedForSpeedEqualsMaxSpeed() {

        SpeedyGame speedyGame = new SpeedyGame(false, 10);

        Assertions.assertTrue(speedyGame.isFailed(10));

    }

    @Test

    public void shouldIsGreenFalseForSpeed0() {

        SpeedyGame speedyGame = new SpeedyGame(false, 10);

        boolean expected = false;
        boolean actual = speedyGame.isFailed(0);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIsFailedForSpeedLessMaxSpeed() {

        SpeedyGame speedyGame = new SpeedyGame(false, 15);

        boolean expected = false;
        boolean actual = speedyGame.isFailed(7);

        Assertions.assertEquals(expected, actual);

    }


}
