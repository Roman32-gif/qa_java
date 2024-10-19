import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {

    private final String sex;
    private final boolean doesHasMane;

    public ParameterizedLionTest(String sex, boolean doesHasMane){
        this.sex = sex;
        this.doesHasMane = doesHasMane;
    }

    @Parameterized.Parameters
    public static Object [] [] getData () {
        return new Object [] [] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testDoesHasMane () throws Exception {
        Lion lion = new Lion(sex, new Feline());
        assertEquals(doesHasMane, lion.doesHaveMane());
    }
}
