import java.util.ArrayList;
import java.util.List;

public class PizzaMargarita extends PizzaBuilder {

    List<Constants.Toppings> toppings = new ArrayList<Constants.Toppings>();

    public List<Constants.Toppings> getToppings() {
        toppings.add(Constants.Toppings.MOZZARELLA_CHEESE);
        toppings.add(Constants.Toppings.FRESH_BASIL_LEAVES);
        toppings.add(Constants.Toppings.OLIVE_OIL);
        return toppings;
    }

}
