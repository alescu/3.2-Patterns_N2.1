import java.util.ArrayList;
import java.util.List;

public class MestrePizzer {
    List<PizzaBuilder> pizzaBuilderList = new ArrayList<PizzaBuilder>();

    public MestrePizzer(PizzaBuilder pizzaBuilder) {
        pizzaBuilderList.add(pizzaBuilder);
    }

    public void addPizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilderList.add(pizzaBuilder);
    }

    public List<PizzaBuilder> getPizzaBuilderList() {
        return pizzaBuilderList;
    }
}
