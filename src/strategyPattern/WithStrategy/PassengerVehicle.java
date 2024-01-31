package strategyPattern.WithStrategy;
import strategyPattern.WithStrategy.Strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalStrategy());
    }
}
