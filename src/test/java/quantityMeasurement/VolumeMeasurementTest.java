package quantityMeasurement;

import org.junit.jupiter.api.*;

public class VolumeMeasurementTest {
    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 2.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAndNull_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1FeetFromDiffType_ShouldReturnNotEqual() {
        Volume volume = new Volume(Volume.Unit.GALLON, 1.0);
        Length length = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(volume, length);
    }

    @Test
    void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 0.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 0.0);
        Assertions.assertEquals(liter1, liter2);
    }

    @Test
    void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 1.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 2.0);
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    void given0GallonAnd0Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Volume liter = new Volume(Volume.Unit.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3$78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        boolean compareCheck = liter.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$57Liter() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume expectedSum = new Volume(Volume.Unit.LITER, 7.56);
        Volume actualSum = gallon.sumOfVolume(liter);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume expectedSum = new Volume(Volume.Unit.LITER, 2.0);
        Volume actualSum = liter.sumOfVolume(ml);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}
