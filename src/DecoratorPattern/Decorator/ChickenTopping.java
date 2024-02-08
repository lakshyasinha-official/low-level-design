package DecoratorPattern.Decorator;

import DecoratorPattern.BaseClass.BasePizza;

public class ChickenTopping extends Topping{

    BasePizza basePizza;

    public ChickenTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public Integer cost() {
        return basePizza.cost() +50;
    }
}
