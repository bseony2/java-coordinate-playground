package fuel;

public enum FuelEfficiency {
    Sonata(10)
    , Avante(15)
    , K5(13);
    public final double distancePerLiter;

    FuelEfficiency(double distancePerLiter) {
        this.distancePerLiter = distancePerLiter;
    }

    public static double getCarFuelEfficiency(Car car) {
        return valueOf(car.getName()).distancePerLiter;
    }
}
