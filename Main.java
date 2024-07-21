import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main { // VehicleRentalSystem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();

        while (true) {
            try {

                System.out.println("Vehicle Rental System");
                System.out.println("1. Rent a Car");
                System.out.println("2. Rent a Bike");
                System.out.println("3. Rent a Truck");
                System.out.println("4. View Rented Vehicles");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Car Model: ");
                        String carModel = sc.nextLine();
                        System.out.println("Enter Rental Days:");
                        int rentalDays = sc.nextInt();
                        Vehicle car = new Car(carModel, rentalDays);
                        rentedVehicles.add(car);
                        car.displayDetails();
                        break;
                    case 2:
                        System.out.print("Enter Bike Brand: ");
                        String bikeBrand = sc.nextLine();
                        System.out.print("Enter Rental Hours: ");
                        int rentalHours = sc.nextInt();
                        Vehicle bike = new Bike(bikeBrand, rentalHours);
                        rentedVehicles.add(bike);
                        bike.displayDetails();
                        break;
                    case 3:
                        System.out.print("Enter Truck Type: ");
                        String truckType = sc.nextLine();
                        System.out.print("Enter Rental Weeks: ");
                        int rentalWeeks = sc.nextInt();
                        Vehicle truck = new Truck(truckType, rentalWeeks);
                        rentedVehicles.add(truck);
                        truck.displayDetails();
                        break;
                    case 4:
                        System.out.println("Rented Vehicles:");
                        for (Vehicle vehicle : rentedVehicles) {
                            vehicle.displayDetails();
                            System.out.println();
                        }
                        break;
                    case 5:
                        System.out.println("Hey , Thank you for using the Vehicle Rental System!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Invalid Input !!!");
            }
        }
    }
}
