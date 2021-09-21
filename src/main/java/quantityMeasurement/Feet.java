package quantityMeasurement;

public class Feet {
    private double value;

    public Feet(double value) {
        this.value = value;
    }
    public Feet() {
    }

    public boolean lengthComparison(double ft, double in) {
        ft = 12 * ft;
        return ft == in;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Feet other = (Feet) obj;
        if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
            return false;
        return true;
    }
}
