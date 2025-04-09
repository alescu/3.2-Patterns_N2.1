import java.util.ArrayList;
import java.util.List;

public class PizzaHawaiian extends PizzaBuilder {

    List<Constants.Toppings> toppings = new ArrayList<Constants.Toppings>();

    public List<Constants.Toppings> getToppings() {
        toppings.add(Constants.Toppings.PIZZA_SAUCE);
        toppings.add(Constants.Toppings.CHEESE);
        toppings.add(Constants.Toppings.COOKED_HAM);
        toppings.add(Constants.Toppings.PINEAPPLE);
        return toppings;
    }

}
