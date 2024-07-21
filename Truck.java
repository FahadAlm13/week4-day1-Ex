public class Truck implements Vehicle {
    private String type;
    private int week;
    private static double weekly_rate = 500.0;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public static double getWeekly_rate() {
        return weekly_rate;
    }

    public static void setWeekly_rate(double weekly_rate) {
        Truck.weekly_rate = weekly_rate;
    }

    @Override
    public double calculateRentalCost() {
        return week * weekly_rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: $" + weekly_rate);
        System.out.println("Rental Cost: $" + calculateRentalCost());

    }
}
