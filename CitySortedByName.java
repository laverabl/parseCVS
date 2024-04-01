import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CitySortedByName implements CitySorter{
    @Override
    public List<City> sort(List<City> cities) {
        return cities.stream().sorted(Comparator.comparing(City::getName, String.CASE_INSENSITIVE_ORDER/*.reversed()*/))
                .collect(Collectors.toList());
    }
}
