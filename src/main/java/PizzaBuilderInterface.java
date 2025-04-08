import java.util.List;

public interface PizzaBuilderInterface {

    void setSize(Constants.Size size);

    void setDough(Constants.Dough dough);

    Constants.PizzaType getPizzaType();

    Constants.Size getSize();

    Constants.Dough getDough();

    void addToppings(Constants.Toppings pizzaTopping);

}
