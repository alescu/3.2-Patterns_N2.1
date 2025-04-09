import java.util.ArrayList;
import java.util.List;

public class PizzaCarbonara extends PizzaBuilder {

    public List<Constants.Toppings> getToppings() {
        toppings.add(Constants.Toppings.BACON);
        toppings.add(Constants.Toppings.EGG);
        toppings.add(Constants.Toppings.MOZZARELLA_CHEESE);
        toppings.add(Constants.Toppings.PARMESAN_CHEESE);
        toppings.add(Constants.Toppings.BLACK_PEPPER);
        toppings.add(Constants.Toppings.OLIVE_OIL);
        return toppings;
    }

}
