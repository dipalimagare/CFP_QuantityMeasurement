package quantityMeasurement;

public enum Volume implements MeasurementUnits {
    MILLI_LITER(0.001), LITER(1), GALLON(3.78);

    private final double baseUnitConversion;

    Volume(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    @Override
    public double convertToBaseUnit(QuantityMeasurementSystem obj) {
        return obj.value * baseUnitConversion;
    }
}
