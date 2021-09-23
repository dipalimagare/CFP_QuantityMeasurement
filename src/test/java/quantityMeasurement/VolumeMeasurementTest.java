package quantityMeasurement;

import org.junit.jupiter.api.*;

public class VolumeMeasurementTest {
    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 2.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAndNull_ShouldReturnNotEqualVolume() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1FeetFromDiffType_ShouldReturnNotEqual() {
        QuantityMeasurementSystem volume = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem length = new QuantityMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(volume, length);
    }

    @Test
    void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        QuantityMeasurementSystem liter2 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        Assertions.assertEquals(liter1, liter2);
    }

    @Test
    void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
        QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem liter2 = new QuantityMeasurementSystem(Volume.LITER, 2.0);
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    void given0GallonAnd0Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3$78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        boolean compareCheck = liter.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$57Liter() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Volume.LITER, 7.56);
        QuantityMeasurementSystem actualSum = gallon.sumOfQuantity(liter, Volume.LITER);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Volume.LITER, 2.0);
        QuantityMeasurementSystem actualSum = liter.sumOfQuantity(ml, Volume.LITER);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}
