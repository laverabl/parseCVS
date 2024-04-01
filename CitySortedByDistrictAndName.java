import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CitySortedByDistrictAndName implements CitySorter{
    @Override
    public List<City> sort(List<City> cities) {

        return cities.stream()
                .sorted(Comparator.comparing(City::getDistrict).thenComparing(City::getName)/*.reversed()*/)
                .collect(Collectors.toList());
    }
}
