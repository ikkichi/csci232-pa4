/*
* Authors: Marielle Korringa, Rachel Angelsberg, Elizabeth Hamaoka
* Date: 24 April 2018
* Overview:
*/


package outlab4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test {

    @Test
    void testGetMinEmptyArray() {
        int array[] = {};
        int n = 24;
        Exception e = assertThrows(IllegalArgumentException.class, () -> { /* ArrayUtils.coinChangeGreedy(array, n);*/ } );
        assertEquals("Array of size 0 is not allowed", e.getMessage());
    }

    @Test
    public void testSomeMethodEmptyArray() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSomeMethodExtra1() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSomeMethodExtra2() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
