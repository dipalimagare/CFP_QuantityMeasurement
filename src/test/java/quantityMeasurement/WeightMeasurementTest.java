package quantityMeasurement;

import org.junit.jupiter.api.*;

public class WeightMeasurementTest {
    @Test
    void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd1Gram_ShouldReturnNotEqualWeight() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = new QuantityMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAndNull_ShouldReturnNotEqualWeight() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqualWeight() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffType_ShouldReturnNotEqualWeight() {
        QuantityMeasurementSystem weight = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem volume = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertNotEquals(weight, volume);
    }

    @Test
    void given1KGAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KILOGRAM, 1.0);
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000KG_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Weight.KILOGRAM, 1001.0);
        QuantityMeasurementSystem actualSum = tonne.sumOfQuantity(gram, Weight.KILOGRAM);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}
