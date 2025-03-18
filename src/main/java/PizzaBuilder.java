import java.util.List;

public interface PizzaBuilder {
    void setSize(PizzaConstants.Size size);
    void setDough(PizzaConstants.Dough dough);
    void setToppings ();
    void getPizzaDescription ();
}
