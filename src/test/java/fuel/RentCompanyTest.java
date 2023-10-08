package fuel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );
    }

    @Test
    void printName() {
        Car k5 = new K5(1000);
        assertThat("K5").isEqualTo(k5.getName());
    }

    @Test
    void reportTest() {
        Car k5 = new K5(260);
        assertThat("K5 : 20리터").isEqualTo(k5.report());
    }

    @Test
    @DisplayName("연비 초기화 테스트")
    void fuelEfficiencyInitializeTest() {
        Car k5 = new K5(0);
        Car avante = new Avante(0);
        Car sonata = new Sonata(0);

        assertThat(13.0).isEqualTo(FuelEfficiency.getCarFuelEfficiency(k5));
        assertThat(15.0).isEqualTo(FuelEfficiency.getCarFuelEfficiency(avante));
        assertThat(10.0).isEqualTo(FuelEfficiency.getCarFuelEfficiency(sonata));
    }
}