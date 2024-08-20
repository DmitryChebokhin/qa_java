import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelinetParamTest {

    private final int input;
    private final int expected;

    public FelinetParamTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] setKittenCount() {
        return new Object[][] {
                {5, 5},
                {10, 10}
        };
    }

    @Test
    public void getKittensInputCountIsCorrectTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(input);
        assertEquals("Некорректное количество котят", expected, actual);
    }
}