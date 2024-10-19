import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testHasMane () throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testGetFood () throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));
        List<String> food = lion.getFood();
        assertEquals(List.of("Мясо"), food);
    }

    @Test
    public  void  testUnknownInfoThrowException () {
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> {new Lion("Неизвестное значение", feline);});
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

}
