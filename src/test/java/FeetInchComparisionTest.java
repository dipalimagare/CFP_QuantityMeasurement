import org.junit.jupiter.api.*;
import quantityMeasurement.*;

public class FeetInchComparisionTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetAndFeetFromSameRef_WhenEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        boolean actual = feet1 == feet1;    // '==' operator is for ref obj
        Assertions.assertTrue(actual);
    }

    @Test
    void givenFeetAndFeetFromDiffRef_WhenNotEqual_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean actual = feet1 == feet2;   // '==' operator is for ref obj
        Assertions.assertFalse(actual);
    }

    @Test
    void given0InchAndNull_ShouldReturnNotEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenInchAndInchFromSameRef_WhenEqual_ShouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        boolean actual = inch1 == inch1;    // '==' operator is for ref obj
        Assertions.assertTrue(actual);
    }

    @Test
    void givenInchAndInchFromDiffRef_WhenNotEqual_ShouldReturnFalse() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        boolean actual = inch1 == inch2;   // '==' operator is for ref obj
        Assertions.assertFalse(actual);
    }

    @Test
    void given1FeetAnd12InchFromDiffType_ShouldReturnNotEqual() {
        Feet feet = new Feet(1.0);
        Inch inch = new Inch(12.0);
        Assertions.assertNotEquals(feet, inch);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenFeetAndInch_WhenEqual_ShouldReturnTrue() {
        Feet feetToInch = new Feet();
        boolean result = feetToInch.lengthComparison(1.0, 12.0);
        Assertions.assertTrue(result);
    }

    @Test
    void givenFeetAndInch_WhenNotEqual_ShouldReturnFalse() {
        Feet feetToInch = new Feet();
        boolean result = feetToInch.lengthComparison(3.0, 10.0);
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchAndFeet_WhenEqual_ShouldReturnTrue() {
        Inch InchToFeet = new Inch();
        boolean result = InchToFeet.lengthComparison(12.0, 1);
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchAndFeet_WhenNotEqual_ShouldReturnFalse() {
        Inch InchToFeet = new Inch();
        boolean result = InchToFeet.lengthComparison(22.0, 3);
        Assertions.assertFalse(result);
    }
}
