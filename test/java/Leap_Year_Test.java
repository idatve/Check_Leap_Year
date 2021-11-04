import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class Leap_Year_Test {
    Check_Leap_Year cly;

    @BeforeEach
    public void setup() {
        cly = new Check_Leap_Year();
    }

    //Testing with assertTrue
    @Test
    public void testIfDivisibleby4Not100() {
        assertTrue("Verify if true", Check_Leap_Year.isLeapYear(2000));
    }

    @Test
    public void testIfDivisibleby400() {
        assertTrue("Verify if true", Check_Leap_Year.isLeapYear(2020));
    }

    //Testing with assertFalse
    @Test
    public void testIfDivisibleby400IsNotTrue() {
        assertFalse("Verify if true", Check_Leap_Year.isLeapYear(2019));
    }

    @Test
    public void testIfDivisibleby4Not100IsNotTrue() {
        assertFalse("Verify if true", Check_Leap_Year.isLeapYear(2019));
    }

    //Testing with assertEquals
    @Test
    public void testIfDivisibleBy4ButNot100() {
        assertEquals(true, Check_Leap_Year.isLeapYear(2020));
    }

    @Test
    public void testIfDivisibleBy400() {
        assertEquals(true, Check_Leap_Year.isLeapYear(2000));
    }

    @Test
    public void testIfDivisibleBy4ButNot100IsFalse() {
        assertEquals(false, Check_Leap_Year.isLeapYear(2019));
    }

    @Test
    public void testIfDivisibleBy400IsFalse() {
        assertEquals(false, Check_Leap_Year.isLeapYear(2019));
    }

}
