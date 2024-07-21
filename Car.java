public class Car implements Vehicle {
    private String model;
    private int day;
    private static final double daily_rate = 50.0;

    public Car(String model, int day) {
        this.model = model;
        this.day = day;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public double calculateRentalCost() {
        return day * daily_rate;
    }


    public void displayDetails() {
        System.out.println("Car Model: " + model);
//        System.out.println("Day: " + day);
        System.out.println("Daily Rental Rate: $" + daily_rate);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
