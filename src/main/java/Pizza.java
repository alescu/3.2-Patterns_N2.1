import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    PizzaConstants.Size size;
    PizzaConstants.Dough dough;
    List<String> toppings = new ArrayList<>();

    public Pizza(String name, PizzaConstants.Size size, PizzaConstants.Dough dough) {
        this.name = name;
        this.size = size;
        this.dough = dough;
    }

}
