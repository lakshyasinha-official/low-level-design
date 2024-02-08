package DecoratorPattern;

import DecoratorPattern.BaseClass.BasePizza;
import DecoratorPattern.BaseClass.MargiPizza;
import DecoratorPattern.Decorator.ChickenTopping;
import DecoratorPattern.Decorator.MushroomTopping;

public class DecoratorMain {

    public static void main(String[] args) {

        BasePizza margi_mushroom =  new MushroomTopping(new MargiPizza());
        System.out.println("margi_mushroom -" +margi_mushroom.cost());

        BasePizza chicke_mushroom =  new ChickenTopping(new MargiPizza());

        System.out.println("chicke_mushroom -" +chicke_mushroom.cost());
    }
}
