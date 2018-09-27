package Tuan4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class junitTest {

    //Test hàm max
    @Test
    public void testMax() {
        maxMin ju = new maxMin();
        assertEquals( 2, ju.max( 1, 2));
        assertEquals( 3, ju.max( 1, 3));
        assertEquals( 1, ju.max( 1, -2));
        assertEquals( 0, ju.max( 0, 0));
        assertEquals( -5, ju.max( -5, -9));
    }

    //Test hàm minOfArr
    @Test
    public void testMinOfArr() {
        maxMin ju = new maxMin();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        assertEquals( 1, ju.minOfArr( arr1));
        int[] arr2 = {-1, -9, 3};
        assertEquals( -9, ju.minOfArr( arr2));
        int[] arr3 = {0, 0, 0, 0};
        assertEquals( 0, ju.minOfArr( arr3));
        int[] arr4 = {-100, 2, 100, -5, 6};
        assertEquals( -100, ju.minOfArr( arr4));
        int[] arr5 = {1, 5, 6};
        assertEquals( 1, ju.minOfArr( arr5));

    }

}
