package quantityMeasurement;

import org.junit.jupiter.api.*;
import quantityMeasurement.*;

public class LengthComparisionTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd0FeetFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNull_ShouldReturnNotEquals() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenInchAndInchFromDiffRef_ShouldReturnNotSame() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    void given0FeetAnd0Inch_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd12Inch_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given12InchAnd1Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 12.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd1Feet_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given0YardAnd0Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        QuantityMeasurementSystem yard2 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0YardAnd1Yard_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        QuantityMeasurementSystem yard2 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0YardAndNull_ShouldReturnNotEqual() {
        QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        QuantityMeasurementSystem yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void given0YardAnd0YardFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurementSystem Yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        QuantityMeasurementSystem Yard2 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        Assertions.assertNotSame(Yard1, Yard2);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 3.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 36.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        QuantityMeasurementSystem cm1 = new QuantityMeasurementSystem(Length.CENTI_METER, 0.0);
        QuantityMeasurementSystem cm2 = new QuantityMeasurementSystem(Length.CENTI_METER, 0.0);
        Assertions.assertEquals(cm1, cm2);
    }

    @Test
    void given0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        QuantityMeasurementSystem cm1 = new QuantityMeasurementSystem(Length.CENTI_METER, 0.0);
        QuantityMeasurementSystem cm2 = new QuantityMeasurementSystem(Length.CENTI_METER, 1.0);
        Assertions.assertNotEquals(cm1, cm2);
    }

    @Test
    void given2InchAnd5Cm_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CmAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 5.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        boolean compareCheck = cm.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 4.0);
        QuantityMeasurementSystem actualSum = inch1.sumOfQuantity(inch2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 14.0);
        QuantityMeasurementSystem actualSum = feet.sumOfQuantity(inch, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 24.0);
        QuantityMeasurementSystem actualSum = feet1.sumOfQuantity(feet2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given2Inch2$5Cm_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTI_METER, 2.5);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 3.0);
        QuantityMeasurementSystem actualSum = inch.sumOfQuantity(cm, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}
