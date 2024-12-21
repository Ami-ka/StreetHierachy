import java.util.*;

public class StreetHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the street:");
        String streetName = scanner.nextLine();
        Street street = new Street(streetName);

        System.out.println("Enter the number of houses on the street:");
        int numberOfHouses = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfHouses; i++) {
            System.out.println("Enter details for house " + (i + 1) + ":");

            System.out.println("Enter house number:");
            int houseNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter owner's name:");
            String ownerName = scanner.nextLine();

            House house = new House(houseNumber, ownerName);
            street.addHouse(house);
        }

        System.out.println("\nStreet details before sorting:");
        street.displayStreetDetails();

        street.sortHousesByNumber();

        System.out.println("\nStreet details after sorting:");
        street.displayStreetDetails();

        scanner.close();
    }
}
