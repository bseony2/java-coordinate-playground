package fuel;

public abstract class Car {
    private final double distance;
    double distancePerLiter;

    public Car() {
        this.distance = 0;
    }
    public Car(double distance) {
        this.distance = distance;
    }
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    double getDistancePerLiter(){return this.distancePerLiter;}

    /**
     * 여행하려는 거리
     */
    double getTripDistance(){return this.distance;}

    /**
     * 차종의 이름
     */
    String getName(){return this.getClass().getSimpleName();}

    /**
     * 주입해야할 연료량을 구한다.
     */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

    String report() {
        return this.getName() + " : " + (int)this.getChargeQuantity() + "리터";
    }
}