import org.junit.Test;
import com.example.Animal;
import java.util.List;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testGetFoodToHerbivores() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    public void testGetFoodToPredator() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void testGetUnknownFood() throws  Exception {
        Animal animal = new Animal();
        Exception exception = assertThrows(Exception.class, () -> {animal.getFood("Неизвестное животное");});
    }

    @Test
    public void testGetFamily () {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
