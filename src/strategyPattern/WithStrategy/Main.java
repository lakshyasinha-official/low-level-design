package strategyPattern.WithStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle sport = new OffRoadVehicle();
        sport.drive();
    }
}
