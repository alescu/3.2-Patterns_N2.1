import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements PizzaBuilderInterface {

    Constants.Size size;
    Constants.Dough dough;
    List<Constants.Toppings> toppings = new ArrayList<Constants.Toppings>();

    @Override
    public PizzaBuilderInterface setSize(Constants.Size size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilderInterface setDough(Constants.Dough dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilderInterface setToppings(List<Constants.Toppings> toppings) {
        this.toppings = toppings;
        return this;
    }

    public List<Constants.Toppings> getToppings() {
        return toppings;
    }

    public Constants.Size getSize() {
        return this.size;
    }

    public Constants.Dough getDough() {
        return this.dough;
    }

    public Pizza getPizza() {
        Pizza pizza = new Pizza(getPizzatype(), this.size, this.dough, getToppings());
        return pizza;
    }

    public String getPizzatype() {
        return "";
    }

}
