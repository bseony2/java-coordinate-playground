package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private final List<Car> carList = new ArrayList<>();
    private static final String NEWLINE = System.getProperty("line.separator");
    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for(Car car: carList) {
            sb.append(car.report()).append(NEWLINE);
        }
        return sb.toString();
    }
}
