import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String filename = "src/City.csv";

        List<City> cities = readCitiesFromCSV(filename);
        printCities(cities);
    }

    public static List<City> readCitiesFromCSV(String filename) {
        List<City> cities = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 6) {
                    String name = parts[1].trim();
                    String region = parts[2].trim();
                    String district = parts[3].trim();
                    long population = Long.parseLong(parts[4].trim());
                    String foundation = parts[5].trim();

                    City city = new City(name, region, district, population, foundation);
                    cities.add(city);
                } else {
                    System.out.println("incorrect format data in cvs file");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cities;
    }

    public static void printCities(List<City> cities) {
        for(City city : cities) {
            System.out.println(city);
        }
    }
}