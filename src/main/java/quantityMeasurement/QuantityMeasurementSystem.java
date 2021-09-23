package quantityMeasurement;

public class QuantityMeasurementSystem {
    public double value;
    public MeasurementUnits unit;

    public QuantityMeasurementSystem(MeasurementUnits unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(QuantityMeasurementSystem that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    public QuantityMeasurementSystem sumOfQuantity(QuantityMeasurementSystem that, MeasurementUnits requiredUnit) {
        double sumOfInput = this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
        return new QuantityMeasurementSystem(requiredUnit, sumOfInput);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        QuantityMeasurementSystem length = (QuantityMeasurementSystem) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
