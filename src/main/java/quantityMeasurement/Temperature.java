package quantityMeasurement;

import java.util.function.*;

public enum Temperature implements MeasurementUnits {
    DEG_F(true), DEG_C(false);

    private final Function<Double, Double> baseUnitConversion;
    private final Function<Double, Double> degFToDegC = (Double degF) -> (degF - 32) * 5 / 9;
    private final Function<Double, Double> degCToDegF =(Double degC) -> degC;

    Temperature(boolean isDegF) {
        if (isDegF) this.baseUnitConversion = degFToDegC;
        else this.baseUnitConversion = degCToDegF;
    }

    @Override
    public double convertToBaseUnit(QuantityMeasurementSystem obj) {
        return baseUnitConversion.apply(obj.value);
    }

}
