import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;


public class FelineTest {

    @Test
    public void testEatMeat () throws Exception{
        Feline feline = new Feline();
        List<String> food = feline.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }


    @Test
    public void testGetFamily () throws Exception {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens () throws Exception {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public  void  testGetKittensSetNumber () throws Exception {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}
