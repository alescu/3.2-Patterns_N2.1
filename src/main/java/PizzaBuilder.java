import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements PizzaBuilderInterface {

    Constants.PizzaType type;
    Constants.Size size;
    Constants.Dough dough;
    List<Constants.Toppings> toppings = new ArrayList<Constants.Toppings>();

    public PizzaBuilder(Constants.Size size, Constants.Dough dough) {
        this.size = size;
        this.dough = dough;
    }

    @Override
    public void setSize(Constants.Size size) {
        this.size = size;
    }

    @Override
    public void setDough(Constants.Dough dough) {
        this.dough = dough;
    }

    @Override
    public Constants.PizzaType getPizzaType() {
        return this.type;
    }

    @Override
    public Constants.Size getSize() {
        return this.size;
    }

    @Override
    public Constants.Dough getDough() {
        return this.dough;
    }

    public void setToppings(List<Constants.Toppings> toppings) {
        this.toppings = toppings;
    }

    @Override
    public void addToppings(Constants.Toppings pizzaTopping) {
        this.toppings.add(pizzaTopping);
    }

    public List<Constants.Toppings> getToppings() {
        return this.toppings;
    }

    public Pizza getPizza() {
        Pizza pizza = new Pizza( this.type, this.size, this.dough, this.toppings);
        return pizza;
    }
}
