import java.util.List;

public class CityPrinterImpl implements CityPrinter {
    @Override
    public void printer(List<City> cities) {
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
