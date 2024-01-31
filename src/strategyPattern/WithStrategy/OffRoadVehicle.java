package strategyPattern.WithStrategy;
import strategyPattern.WithStrategy.Strategy.OffRoadStrategy;

public class OffRoadVehicle extends  Vehicle{
    OffRoadVehicle() {
        super(new OffRoadStrategy());
    }
}
