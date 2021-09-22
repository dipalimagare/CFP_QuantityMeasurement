package quantityMeasurement;

import org.junit.jupiter.api.*;

public class WeightMeasurementTest {
    @Test
    void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd1Gram_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAndNull_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffType_ShouldReturnNotEqualWeight() {
        Weight weight = new Weight(Weight.Unit.GRAM, 0.0);
        Volume volume = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertNotEquals(weight, volume);
    }

    @Test
    void given1KGAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        Weight kg = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000KG_WhenCompared_ShouldReturnEqualWeight() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight kg = new Weight(Weight.Unit.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        Weight expectedSum = new Weight(Weight.Unit.KILOGRAM, 1001.0);
        Weight actualSum = tonne.sumOfWeight(gram);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}
