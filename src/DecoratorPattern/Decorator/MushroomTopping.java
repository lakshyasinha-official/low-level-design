package DecoratorPattern.Decorator;

import DecoratorPattern.BaseClass.BasePizza;

public class MushroomTopping extends Topping{

    BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public Integer cost() {
        return basePizza.cost() +10;
    }
}
