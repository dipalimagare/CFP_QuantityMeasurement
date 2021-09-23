package quantityMeasurement;

import org.junit.jupiter.api.*;

public class TemperatureMeasurementTest {
    @Test
    void given0DegFAnd0DegF_ShouldReturnEqualTemperature() {
        QuantityMeasurementSystem temp1 = new QuantityMeasurementSystem(Temperature.DEG_F, 0.0);
        QuantityMeasurementSystem temp2 = new QuantityMeasurementSystem(Temperature.DEG_F, 0.0);
        Assertions.assertEquals(temp1, temp2);
    }

    @Test
    void given0DegFAnd1DegF_ShouldReturnNotEqualTemperature() {
        QuantityMeasurementSystem temp1 = new QuantityMeasurementSystem(Temperature.DEG_F, 0.0);
        QuantityMeasurementSystem temp2 = new QuantityMeasurementSystem(Temperature.DEG_F, 1.0);
        Assertions.assertNotEquals(temp1, temp2);
    }

    @Test
    void given0DegFAndNull_ShouldReturnNotEqualTemperature() {
        QuantityMeasurementSystem temp1 = new QuantityMeasurementSystem(Temperature.DEG_F, 0.0);
        QuantityMeasurementSystem temp2 = null;
        Assertions.assertNotEquals(temp1, temp2);
    }

    @Test
    void given0DegFAnd0DegFFromDiffRef_ShouldReturnNotEqualTemperature() {
        QuantityMeasurementSystem temp1 = new QuantityMeasurementSystem(Temperature.DEG_F, 0.0);
        QuantityMeasurementSystem temp2 = new QuantityMeasurementSystem(Temperature.DEG_F, 1.0);
        Assertions.assertNotSame(temp1, temp2);
    }

    @Test
    void given0DegFAnd0DegFFromDiffType_ShouldReturnNotEqualTemperature() {
        QuantityMeasurementSystem temp = new QuantityMeasurementSystem(Temperature.DEG_F, 0.0);
        QuantityMeasurementSystem weight = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertNotEquals(temp, weight);
    }

    @Test
    void given212DegFAnd100DegC_WhenCompared_ShouldReturnEqualTemp() {
        QuantityMeasurementSystem DegF = new QuantityMeasurementSystem(Temperature.DEG_F, 212.0);
        QuantityMeasurementSystem DegC = new QuantityMeasurementSystem(Temperature.DEG_C, 100.0);
        boolean compareCheck = DegF.compare(DegC);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given77DegFAnd25DegC_WhenCompared_ShouldReturnEqualTemp() {
        QuantityMeasurementSystem DegF = new QuantityMeasurementSystem(Temperature.DEG_F, 77.0);
        QuantityMeasurementSystem DegC = new QuantityMeasurementSystem(Temperature.DEG_C, 25.0);
        boolean compareCheck = DegF.compare(DegC);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given25DegCAnd77DegF_WhenCompared_ShouldReturnEqualTemp() {
        QuantityMeasurementSystem DegC = new QuantityMeasurementSystem(Temperature.DEG_C, 25.0);
        QuantityMeasurementSystem DegF = new QuantityMeasurementSystem(Temperature.DEG_F, 77.0);
        boolean compareCheck = DegC.compare(DegF);
        Assertions.assertTrue(compareCheck);
    }
}