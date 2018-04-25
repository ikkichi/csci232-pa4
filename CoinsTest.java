package outlab4;


import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class CoinsTest {

    Random rand = new Random();

    @Test
    void testGetMinEmptyArray() {
        int[] coins = {};
        int m = coins.length;
        int n = 24;

        Exception e = assertThrows(IllegalArgumentException.class, () -> { Coins.makeChange(coins, m, n); } );
        assertEquals("Array of size 0 is not allowed", e.getMessage());
    }

    @Test
    void testChange() {
        int[] coins = {1, 5, 10, 25};
        int m = coins.length;
        int n = -2;

        Exception e = assertThrows(IllegalArgumentException.class, () -> { Coins.makeChange(coins, m, n); } );
        assertEquals("Change must be a positive nonzero number", e.getMessage());
    }

    @Test
    void testMakeChangeWithRandomHigh() {
        int [] coins = {1, 5, 10, 25};
        int m = coins.length;
        System.out.println("Generating random amount of money up to $10...");
        int amt = rand.nextInt(1000);
        System.out.println("Money generated: " + amt + " cents");

        System.out.println("Coins used: " + Coins.makeChange(coins, m, amt));
        System.out.println();
    }

    @Test
    void testMakeChangeWithRandomLow() {
        int [] coins = {1, 5, 10, 25};
        int m = coins.length;
        System.out.println("Generating random amount of money up to $1...");
        int amt = rand.nextInt(100);
        System.out.println("Money generated: " + amt + " cents");

        System.out.println("Coins used: " + Coins.makeChange(coins, m, amt));
        System.out.println();
    }

}