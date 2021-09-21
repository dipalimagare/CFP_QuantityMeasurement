import org.junit.jupiter.api.*;
import quantityMeasurement.*;

public class YardFeetComparisionTest {
    @Test
    void givenYardAndNull_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0);
        Yard yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void givenYardAndYardFromSameRef_WhenEqual_ShouldReturnTure() {
        Yard yard1 = new Yard(0);
        boolean result = yard1 == yard1;
        Assertions.assertTrue(result);
    }

    @Test
    void givenYardAndYardFromDiffRef_WhenNotEqual_ShouldReturnFalse() {
        Yard yard1 = new Yard(0);
        Yard yard2 = new Yard(0);
        boolean result = yard1 == yard2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenYardAndFeetFromDiffType_ShouldReturnFalse() {
        Yard yard = new Yard(0);
        Feet feet = new Feet(3.0);
        boolean result = yard.equals(feet);
        Assertions.assertFalse(result);
    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(0);
        Yard yard2 = new Yard(0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    void given0YardAnd1Yard_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0);
        Yard yard2 = new Yard(1);
        Assertions.assertNotEquals(yard1, yard2);
    }
}
