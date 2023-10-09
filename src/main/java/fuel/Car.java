package fuel;

public abstract class Car implements Drivable{
    private final double distance;
    private final double distancePerLiter;

    public Car() {
        this(0);
    }

    public Car(double distance) {
        this.distance = distance;
        this.distancePerLiter = FuelEfficiency.getCarFuelEfficiency(this);
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    @Override
    public double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    /**
     * 여행하려는 거리
     */
    @Override
    public double getTripDistance() {
        return this.distance;
    }

    /**
     * 차종의 이름
     */
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    /**
     * 주입해야할 연료량을 구한다.
     */
    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

    String report() {
        return this.getName() + " : " + (int) this.getChargeQuantity() + "리터";
    }
}