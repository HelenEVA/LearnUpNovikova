import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstantPlayerTest {

    @Test

    public void shouldGetSpeed(){

        ConstantPlayer constantPlayer = new ConstantPlayer(10);

        int expected = 10;
        int actual = constantPlayer.getSpeed();

        Assertions.assertEquals(expected, actual);

    }
}
