import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FastPlayerTest {

    @Test

    public void shouldGetSpeed(){

        FastPlayer fastPlayer = new FastPlayer(15, 5);

        int expected = 15;
        int actual = fastPlayer.getSpeed();

        Assertions.assertEquals(expected,actual);

    }
}
