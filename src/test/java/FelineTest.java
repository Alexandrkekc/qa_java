import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void getFamilyShouldReturnFelineFamily() {
        String family = "Кошачьи";
        assertEquals(family, feline.getFamily());
    }

    @Test
    public void getKittensShouldReturnOneKitten() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithDifferentCount() {
        assertEquals(6, feline.getKittens(6));
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> foodFofFeline = List.of("Животные", "Птицы", "Рыба");
        assertEquals(foodFofFeline, feline.eatMeat());
    }

}
