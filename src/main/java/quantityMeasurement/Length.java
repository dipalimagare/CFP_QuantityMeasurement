package quantityMeasurement;

public enum Length implements MeasurementUnits {
    CENTI_METER(1 / 2.5), INCH(1), FEET(12), YARD(36);

    public final double baseUnitConversion;

    Length(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    @Override
    public double convertToBaseUnit(QuantityMeasurementSystem obj) {
        return obj.value * baseUnitConversion;
    }
}
