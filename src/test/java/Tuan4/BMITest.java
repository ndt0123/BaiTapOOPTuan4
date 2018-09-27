package Tuan4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BMITest {


    @Test
    public void TestBMI() {
        bmi b = new bmi();
        assertEquals( "Bình thường", b.BMI( 55, 1.7));
        assertEquals( "Thiếu cân", b.BMI( 49, 1.7));
        assertEquals( "Bình thường", b.BMI( 65, 1.7));
        assertEquals( "Thiếu cân", b.BMI( 45, 1.6));
        assertEquals( "Thừa cân", b.BMI( 65, 1.5));
    }

}
