package quantityMeasurement;

public class Length {
    public enum Unit {FEET, YARD, CENTI_METER, INCH}

    private static final double INCH_TO_CM = 2.5;
    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_TO_FEET = 3.0;
    private static final double YARD_TO_INCH = 36.0;
    public double value;
    public Unit unit;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value * FEET_TO_INCH) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_FEET) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_INCH) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTI_METER))
            return Double.compare(this.value * INCH_TO_CM, that.value) == 0;
        if (this.unit.equals(Unit.CENTI_METER) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value * INCH_TO_CM) == 0;
        return false;
    }

    public Length sumOfLength(Length that) {
        double sumOfInput = 0.0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            sumOfInput = this.value + that.value;
        else if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            sumOfInput = this.value * FEET_TO_INCH + that.value;
        else if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            sumOfInput = this.value * FEET_TO_INCH + that.value * FEET_TO_INCH;
        else if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTI_METER))
            sumOfInput = this.value + that.value / INCH_TO_CM;
        return new Length(Unit.INCH, sumOfInput);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
