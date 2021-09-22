package quantityMeasurement;

import org.junit.jupiter.api.*;

public class TemperatureMeasurementTest {
    @Test
    void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temp1, temp2);
    }

    @Test
    void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temp1, temp2);
    }

    @Test
    void given0FahrenheitAndNull_ShouldReturnNotEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = null;
        Assertions.assertNotEquals(temp1, temp2);
    }

    @Test
    void given0FahrenheitAnd0FahrenheitFromDiffRef_ShouldReturnNotEqualTemperature() {
        Temperature temp1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temp2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotSame(temp1, temp2);
    }

    @Test
    void given0FahrenheitAnd0FahrenheitFromDiffType_ShouldReturnNotEqualTemperature() {
        Temperature temp = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Weight weight = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertNotEquals(temp, weight);
    }

    @Test
    void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqualTemp() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given77FahrenheitAnd25Celsius_WhenCompared_ShouldReturnEqualTemp() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 77.0);
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 25.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }
}