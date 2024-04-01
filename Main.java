import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String filename = "src/City.csv";

        DataReader reader = new CVSCityDataReader();
        List<City> cities = reader.readCities(filename);

//        Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;
//        В ответах для проверки нет сортировки по убыванию!

//        CitySorter sorter1 = new CitySortedByName();
//        cities = sorter1.sort(cities);
////
//        CityPrinter printer = new CityPrinterImpl();
//
//        System.out.println("SORTING BY NAME IN DESCENDING ORDER: ");
//        printer.printer(cities);
//        System.out.println("\n");
//
//
//        CitySorter sorter2 = new CitySortedByDistrictAndName();
//        cities = sorter2.sort(cities);
//        System.out.println("SORTING BY DISTRICT AND NAME IN DESCENDING ORDER: ");
//        printer.printer(cities);

        analyzerPopulation(cities);

    }

    public static void analyzerPopulation(List<City> cities) {
        City[] citiesArray = cities.toArray(new City[cities.size()]);

        int maxPopulationIndex = 0;
        long maxPopulation = citiesArray[0].getPopulation();
        for (int i = 1; i < citiesArray.length; i++) {
            if (citiesArray[i].getPopulation() > maxPopulation) {
                maxPopulation = citiesArray[i].getPopulation();
                maxPopulationIndex = i;
            }
        }

        System.out.println("[" + maxPopulationIndex + "] = " + maxPopulation);
    }
}