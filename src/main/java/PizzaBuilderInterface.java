import java.util.List;

public interface PizzaBuilderInterface {

    PizzaBuilderInterface setPizzaType(String pizzatype);

    PizzaBuilderInterface setSize(Constants.Size size);

    PizzaBuilderInterface setDough(Constants.Dough dough);

    PizzaBuilderInterface setToppings(List<Constants.Toppings> toppings);

    Pizza build();

}
