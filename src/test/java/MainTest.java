import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void Triangle() {
        assertTrue(Main.triangle(3, 4, 5));
        assertFalse(Main.triangle(1, 2, 5));
        assertFalse(Main.triangle(0, 0, 0));
        assertFalse(Main.triangle(-1, -2, -3));
    }

    @Test
    public void Distance() {
        assertEquals(5.0, Main.distance(1, 2, 4, 6), 0.01);
        assertEquals(5.0, Main.distance(0, 0, 3, 4), 0.01);
        assertEquals(4.472135954999579, Main.distance(-1, -2, 1, 2), 0.01);
    }

    @Test
    public void PowerLoop() {
        assertEquals(8.0, Main.powerLoop(2, 3), 0.01);
        assertEquals(81.0, Main.powerLoop(3, 4), 0.01);
        assertEquals(0.0, Main.powerLoop(0, 5), 0.01);
        assertEquals(-8.0, Main.powerLoop(-2, 3), 0.01);
    }

    @Test
    public void PowerRecursive() {
        assertEquals(8.0, Main.power(2, 3), 0.01);
        assertEquals(81.0, Main.power(3, 4), 0.01);
        assertEquals(0.0, Main.power(0, 5), 0.01);
        assertEquals(-8.0, Main.power(-2, 3), 0.01);
    }

    @Test
    public void Tribonacci() {
        assertEquals(0, Main.tribonacci(0));
        assertEquals(0, Main.tribonacci(1));
        assertEquals(1, Main.tribonacci(2));
        assertEquals(1, Main.tribonacci(3));
        assertEquals(2, Main.tribonacci(4));
        assertEquals(4, Main.tribonacci(5));
    }
}

