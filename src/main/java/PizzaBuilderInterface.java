import java.util.List;

public interface PizzaBuilderInterface {

    void setPizzaType(Constants.PizzaType pizzaType);

    void setSize(Constants.Size size);

    void setDough(Constants.Dough dough);

    void setToppings(List<Constants.Toppings> toppings);

    Pizza getPizza();

}
