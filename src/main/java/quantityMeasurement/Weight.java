package quantityMeasurement;

public class Weight {
    enum Unit {KILOGRAM, TONNE, GRAM}

    private static final double TONNE_TO_KILO_GRAM = 1000.0;
    private static final double KILO_GRAM_TO_GRAM = 1000.0;
    private final Unit unit;
    private final double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Weight that) {
        if (this.unit.equals(Unit.KILOGRAM) && that.unit.equals(Unit.GRAM))
            return Double.compare(this.value * KILO_GRAM_TO_GRAM, that.value) == 0;
        if (this.unit.equals(Unit.TONNE) && that.unit.equals(Unit.KILOGRAM))
            return Double.compare(this.value * TONNE_TO_KILO_GRAM, that.value) == 0;
        return false;
    }

    public Weight sumOfWeight(Weight that) {
        double sumOfWeight = 0.0;
        if (this.unit.equals(Unit.TONNE) && that.unit.equals(Unit.GRAM))
            sumOfWeight = this.value * TONNE_TO_KILO_GRAM + that.value / KILO_GRAM_TO_GRAM;
        return new Weight(Unit.KILOGRAM, sumOfWeight);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Weight weight = (Weight) that;
        return Double.compare(weight.value, value) == 0 && unit == weight.unit;
    }
}
