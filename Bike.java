public class Bike implements Vehicle {
    private String brand;
    private int hour;
    private static final double hourly_rate = 10.0;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour * hourly_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: $" + hourly_rate);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
