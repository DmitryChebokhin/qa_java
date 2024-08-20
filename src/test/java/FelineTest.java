import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }


    @Test
    public void getKittensDefaultIsCorrectTest() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Некорректное колличество котят", expected, actual);
    }

    @Test
    public void getKittensInputCountIsCorrectTest(){
        Feline feline = new Feline();
        int expected = 5;
        int actual = feline.getKittens(5);
        assertEquals("Некорректное колличество котят", expected, actual);
    }
}