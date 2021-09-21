package quantityMeasurement;

public class Inch {
    private double value;

    public Inch(double value) {
        this.value = value;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Inch other = (Inch) obj;
        if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
            return false;
        return true;
    }

    public Inch() {
    }

    public boolean lengthComparison(double in, int ft) {
        ft = ft * 12;
        return ft == in;
    }
}

