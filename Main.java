import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String filename = "src/City.csv";

        DataReader reader = new CVSCityDataReader();
        List<City> cities = reader.readCities(filename);

//        Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;
//        В ответах для проверки нет сортировки по убыванию!

        CitySorter sorter1 = new CitySortedByName();
        cities = sorter1.sort(cities);
//
        CityPrinter printer = new CityPrinterImpl();

        System.out.println("SORTING BY NAME IN DESCENDING ORDER: ");
        printer.printer(cities);
        System.out.println("\n");


        CitySorter sorter2 = new CitySortedByDistrictAndName();
        cities = sorter2.sort(cities);
        System.out.println("SORTING BY DISTRICT AND NAME IN DESCENDING ORDER: ");
        printer.printer(cities);

    }
}