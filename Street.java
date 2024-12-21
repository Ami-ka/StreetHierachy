import java.util.*;

public class Street {
    private String name;
    private List<House> houses;

    public Street(String name) {
        this.name = name;
        this.houses = new ArrayList<>();
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void displayStreetDetails() {
        System.out.println("Street Name: " + name);
        System.out.println("Number of Houses: " + houses.size());
        for (House house : houses) {
            System.out.println(house);
        }
    }

    public void sortHousesByNumber() {
        houses.sort(Comparator.comparingInt(House::getNumber));
    }
}