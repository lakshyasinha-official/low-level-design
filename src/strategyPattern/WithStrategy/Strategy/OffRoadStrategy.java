package strategyPattern.WithStrategy.Strategy;

public class OffRoadStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Drive strategy");
    }
}
